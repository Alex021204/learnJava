package Generics;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfAnimal.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

        /*
        Object
        Animal
        Dog
         */

    }
    private static void test(List<? extends Animal> list) {
        for(Animal animal : list) {
            animal.eat();
        }
    }
}
