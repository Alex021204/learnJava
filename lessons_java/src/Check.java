public class Check {
    public static void main(String[] args) {
        //public, private, default(все что default доступно в пределах этого пакета,
        // protected(доступны в пределах одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета)


        //Person person1 = new Person();
        //person1.name = "Bob";

        Person p1 = new Person();
        System.out.println(p1.name);
    }
}
class Check2 {      //не может быть два public класса

}
