import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст и нажмите <Enter>:");
        String text = new Scanner(System.in).nextLine();
        System.out.printf("Длина текста: %d", text.length());
    }
}
