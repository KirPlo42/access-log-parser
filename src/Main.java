import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        while(true) {
            System.out.println("Please enter path to the file");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (isDirectory){
                System.out.printf("This is path (%s) to the directory \n", path);
                continue;
            }
            if (!fileExists){
                System.out.printf("File %s is not exist \n", path);
                continue;
            }
            System.out.println("This is correct path to the file");
            counter++;
            System.out.printf("Number for this file - %d \n", counter);
        }

    }
}
