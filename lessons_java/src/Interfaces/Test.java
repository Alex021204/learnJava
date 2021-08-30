package Interfaces;

public class Test {
    public static void main(String[] args){
      Info info1 = new Animal(1);
      Info info2 = new Person("Bob");
      //info1.showInfo();
      //info2.showInfo();
        outputIfo(info1);
        outputIfo(info2);
    }
    public static void outputIfo(Info info){
        info.showInfo();
    }
}
