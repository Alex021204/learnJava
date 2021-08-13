public class Arrays {
    public static void main(String[] args){
        int number = 10;//приметивный тип данных      //10
        int[] numbers = new int[5];//               numbers -> [массив]    ссылочный тип данных
        for(int i = 0; i < numbers.length; i++){
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1, 5, 6, 4};//если заранее знаем
        for(int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}
