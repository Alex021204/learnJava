package Interfaces_6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions_1 {
    public static void main(String[] args) {
        /*
        File file = new File("Test");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try catch");

         */
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка ислючения в методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("ad"); //Test
        Scanner scanner = new Scanner(file);
    }
}
