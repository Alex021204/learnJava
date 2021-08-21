public class Lesson_this {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(18);
        human1.getInfo();
        Human human2 = new Human();
        human1.setName("Bob");
        human1.setAge(12);
        human1.getInfo();
    }
}
class Human{
    java.lang.String name;
    int age;

    public void setName(java.lang.String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public java.lang.String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+","+age);
    }
 }
