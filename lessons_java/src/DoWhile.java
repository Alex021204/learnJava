import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи 5");
        int myInt;
        do{
            System.out.println("введи 5");
            myInt = scanner.nextInt();

        }while(myInt!=5);
        System.out.println("вы ввели 5");
    }
}
