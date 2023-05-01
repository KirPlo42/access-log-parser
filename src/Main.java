import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число (a):");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число (b):");
        int b = new Scanner(System.in).nextInt();
        System.out.printf("a + b = %d \n", a + b);
        System.out.printf("a - b = %d \n", a - b);
        System.out.printf("a * b = %d \n", a * b);
        System.out.printf("a / b = %s", (double) a / b);
    }
}
