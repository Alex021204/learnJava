package Interfaces_4;

public class Test {
    public static void main(String[] args){
        /*
        Dog dog = new Dog();
        // Upcasting - восходящее преобразование
        Animal animal = dog;

        // Downcasting - нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();

         */
        // ситуация при которой будет ошибка
        Animal animal = new Animal();
        Dog dog = (Dog)animal;
        dog.bark();
    }
}
