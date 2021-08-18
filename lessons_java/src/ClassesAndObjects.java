public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setNameAndAge("Артем", 30);
        java.lang.String s1 = "Алекс";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 16);
        person1.speak();
        person2.speak();
    }
}
class Person{
    //У класса могут быть:
    //1. Данные(поля)
    //2. Действия, которые он совершает(методы)
    java.lang.String name;
    int age;

    void setNameAndAge(java.lang.String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){
        for(int i = 0; i < 3; i++){
        System.out.println("Меня зовут "+name +","+"мне "+age+"лет");}
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}