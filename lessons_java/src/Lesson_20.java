import java.lang.String;
public class Lesson_20 {
    public static void main(String[] args){
        Appearance human1 = new Appearance();
    }
}
class Appearance {
    private String name;
    private int age;

    public Appearance(){           //простой конструкторб который мы не видим
        this.name = "имя поумолчанию";
        this.age = 0;
    }
    public Appearance(String name) {
        System.out.println("привет из второго конструктора!");
        this.name = name;
    }
    public  Appearance(String name, int age) {
        System.out.println("привет из третьего конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){this.name = name;}

    public void getAge(int age){this.age = age;}
}