public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Артем";
        person1.age = 29;
        System.out.println("Меня зовут "+person1.name +","+"мне "+person1.age+"лет");
        Person person2 = new Person();
        person2.name = "Алекс";
        person2.age = 16;
        System.out.println("Меня зовут "+person2.name +","+"мне "+person2.age+"лет");
    }
}
class Person{
    //У класса могут быть:
    //1. Данные(поля)
    //2. Действия, которые он совершает(методы)
    java.lang.String name;
    int age;
}