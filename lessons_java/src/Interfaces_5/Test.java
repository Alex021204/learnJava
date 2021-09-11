package Interfaces_5;
import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        /*
        //////java 5//////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog"); //1
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

         */



        ////// с появлением дженериков
        List<String> animal = new ArrayList<String>();
        animal.add("dog");
        animal.add("cat");
        animal.add("frogs");
        
        String animals = animal.get(1);


        //////java 7//////
        List<String> animals3 = new ArrayList<>();
    }
}
class Animal {

}
