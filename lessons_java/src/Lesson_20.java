import java.lang.String;
public class Lesson_20 {
    public static void main(String[] args){
        Appearance a1 = new Appearance("Bob",40);
        Appearance a2 = new Appearance("Tim",22);
        a1.countNumberOfPeople();
        a2.countNumberOfPeople();
        Appearance a3 = new Appearance("Sergio",58);
        a1.countNumberOfPeople();
        a2.countNumberOfPeople();
        a3.countNumberOfPeople();
    }
}
class Appearance {
    private String name;
    private int age;

    private static int countPeople;
    public Appearance(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public void countNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}
