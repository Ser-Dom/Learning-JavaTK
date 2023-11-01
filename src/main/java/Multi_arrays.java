public class Multi_arrays {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3, 8},
                           {4, 5, 6},
                           {7, 8, 9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        System.out.println(matrice[0][3]);

        String[][] mArray = new String[2][4];
        mArray[0][0] = "Hello";
        System.out.println(mArray[0][0]);

        int[][] matrice2 = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        for(int i=0;i<matrice2.length; i++){
            for(int j=0; j<matrice2[i].length; j++){
                System.out.print(matrice2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
