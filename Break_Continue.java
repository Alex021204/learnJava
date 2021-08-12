public class Break_Continue {
    public static void main(String[] args) {
//        int i = 5;
//        while(true){
//            if(i==15){
//                break;
//            }
//            System.out.println(i);
//           i = +1;
//        }
//        System.out.println("мы вышли из цикла");
        int i;
        for (i = 0; i <= 15; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("это нечетное число"+i);
        }
    }
}