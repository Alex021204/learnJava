import java.lang.String;
public class ToString {
    public static void main(String[] args){
        Man m1 = new Man("Sergio", 16);
    }
}
class Man{
    private String name;
    private int age;

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+", "+age;
    }
}
