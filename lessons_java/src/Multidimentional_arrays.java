public class Multidimentional_arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        System.out.println(number[2]);

        int[][] matrice = {{1,2,3,4,5},
                           {4,5,},
                           {9}};

//        System.out.println(matrice[2][0]);
//        System.out.println(matrice[0][3]);
//        System.out.println(matrice[1][1]);
//
//        int[] number1 = new int[5];
//
//        java.lang.String[][] strings = new java.lang.String[2][3];
//        strings[0][1] = "Hi";
//        System.out.println(strings[0][1]);
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                System.out.println(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}