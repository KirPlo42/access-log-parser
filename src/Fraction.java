import java.util.Arrays;
import java.util.List;

public class Fraction extends Number{
    final int numerator;
    final int divider;

    public Fraction(int numerator, int divider) throws Exception {
        if (divider <= 0)
            throw new IllegalArgumentException("divider must be positive");
        this.numerator = numerator;
        this.divider = divider;
    }

    public static Fraction sumOrMinus(Fraction fraction1, Fraction fraction2, Boolean invertSecondNumerator) throws Exception {
        int tempSecondNum = fraction2.numerator;
        if (invertSecondNumerator)
            tempSecondNum = tempSecondNum * (-1);
        int tempDivider = minMultiple(fraction1.divider, fraction2.divider);
        int tempNum = fraction1.numerator * (tempDivider / fraction1.divider) + tempSecondNum * (tempDivider / fraction2.divider);
        return new Fraction(tempNum, tempDivider);
    }

    public Fraction sum(Fraction fraction) throws Exception {
        return sumOrMinus(this, fraction, false);
    }

    public Fraction sum(int number) throws Exception {
        return sumOrMinus(this, new Fraction(number, 1), false);
    }

    public Fraction minus(Fraction fraction) throws Exception {
        return sumOrMinus(this, fraction, true);
    }

    public Fraction minus(int number) throws Exception {
        return sumOrMinus(this, new Fraction(number, 1), true);
    }


    private static int bothDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return bothDivisor(b, a % b);
    }

    private static int minMultiple(int a, int b) {
        return a * b / bothDivisor(a, b);
    }

    @Override
    public String toString() {
        return numerator +
                "/" + divider;
    }

    @Override
    public int intValue() {
        return this.numerator / this.divider;
    }

    @Override
    public long longValue() {
        return this.numerator / this.divider;
    }

    @Override
    public float floatValue() {
        return (float)this.numerator / this.divider;
    }

    @Override
    public double doubleValue() {
        return (double) this.numerator / this.divider;
    }


}
