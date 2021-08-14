public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        java.lang.String[] str = new java.lang.String[3];
        str[0] = "hi";
        str[1] = "good-bye";
        str[2] = "java";
//        System.out.println(str[0]);
//        System.out.println(str[2]);

        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        System.out.println();
        for (java.lang.String string:str){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int num = 0;
        for (int x:numbers){
            num = num+x;
            System.out.println();
            System.out.println(num);

            int value = 0;           //для ссылочных
            java.lang.String s = null;
            System.out.println(s);
        }
    }
}
