public class Methods {


    public static double fraction(double x) {
        return x - (int) x;
    }

    public static int sumLastNums(int x) {
        if (x >= 10 || x<= -10) { //fix
            return x % 10 + (x / 10) % 10;
        } else {
            System.out.println("There are not enough numbers");
            return 0;
        }
    }

    public static int charToNum(char x) {
        if (x >= '0' && x <= '9') {
            return Character.getNumericValue(x); //fix
        } else {
            System.out.println("Wrong char. Please input char-number from 0 to 9");
            return 0;
        }
    }

    public static boolean isPositive(int x) {
        if (x == 0) {
            System.out.println("This is zero");
            return false;
        } else return x > 0;
    }

    public static boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x >= -99 && x <= -10);
    }

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        return (num >= a && num <= b) || (num <= a && num >= b);
    }

    public static boolean isDivisor(int a, int b) {
        if (a==0 || b ==0){ //fix
            System.out.println("Zero is not supported");
            return false;
        }
        return (a / b == (double) a / b) || (b / a == (double) b / a);
    }

    public static boolean isEqual (int a, int b, int c){
        return a == b && b == c;
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
