public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Какое-то имя");
        person1.setAge(22);
        System.out.println("Выводим значение в main методе:" + person1.getName());
        System.out.println("Выводим значение в main методе:" + person1.getAge());
    }
}
class Person {
    private java.lang.String name;
    private int age;

    //У класса могут быть:
    //1. Данные(поля)
    //2. Действия, которые он совершает(методы)
    public void setName(java.lang.String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты не ввел имя");
        } else {
            name = userName;}
    }
    public java.lang.String getName() {       //внутреннюю перемену можно менять как угодно
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0){
            System.out.println("Возраст должен быть положительным");
        } else {
        age = userAge;}
    }

    public int getAge() {
        return age;
    }


    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + "," + "мне " + age + "лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
