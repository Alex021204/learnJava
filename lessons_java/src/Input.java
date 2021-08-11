import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("введите что-нибудь");
        java.lang.String string = s.nextLine();
        System.out.println("вы ввели" + string);
    }
}
