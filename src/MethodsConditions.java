import java.util.Locale;

public class MethodsConditions {
    public static int abs(int x) {
        return Math.abs(x);
    }

    public static int safeDiv(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("Zero is not supported");
            return 0;
        }
        return x / y;
    }

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static String makeDecision(int x, int y) {
        if (x > y) {
            return String.format("%d > %d", x, y);
        } else if (x < y) {
            return String.format("%d < %d", x, y);
        } else return String.format("%d == %d", x, y);
    }

    public static int max3(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }

    public static boolean sum3(int x, int y, int z) {
        return x + y == z || y + z == x || z + x == y;
    }

    public static int sum2(int x, int y) {
        if (x + y >= 10 && x + y <= 19) {
            return 20;
        }
        return x + y;
    }

    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        return x % 3 == 0 || x % 5 == 0;
    }

    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || x + y == 6 || Math.abs(x - y) == 6;
    }

    public static String age(int x) {
        int ageLastNumber = x % 10;
        boolean exclusion = (x % 100 >= 11) && (x % 100 <= 14);
        String old = "";
        if (ageLastNumber == 1)
            old = "год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5)
            old = "лет";
        else if (ageLastNumber >= 2)
            old = "года";
        if (exclusion)
            old = "лет";
        return x + " " + old;
    }

    public static String day(int x) {
        return switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресение";
            default -> "это не день недели";
        };
    }

    public static void printDays(String x){
        switch(x.toLowerCase()){
            case "понедельник": System.out.println("Понедельник");
            case "вторник": System.out.println("Вторник");
            case "среда": System.out.println("Среда");
            case "четверг": System.out.println("Четверг");
            case "пятница": System.out.println("Пятница");
            case "суббота": System.out.println("Суббота");
            case "воскресение": System.out.println("Воскресение");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

}
