public class Cycles {
    public static String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i;
            if(i!=x){
                result += " ";
            }
        }
        return result;
    }

    public static String reverseListNums(int x) {
        String result = "";
        for (; x >= 0; x--) {
            result += x + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    public static int pow(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public static int numLen(long x) {
        String temp = String.valueOf(x);
        return temp.length();
    }

    public static boolean equalNum(int x) {
        while (x / 10 > 0) {
            if (x / 10 % 10 != x % 10) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int n = 1; n <= x - i; n++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        if (x != randomNum) {
            System.out.println("No, try again");
        } else {
            System.out.println("Yes, it`s " + randomNum);
        }
    }

    public static void guessGameV2() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = 0;
        int counter = 0;
        while (x != randomNum) {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
            counter++;
        }
        System.out.printf("You win after %d attempts", counter);
    }


}
