public class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    @Override
    public void sleep(){

    }
    public void bark(){
        System.out.println("I am barking");
    }
    public void showName(){
        System.out.println(name);
    }
}
