import java.util.Arrays;

public class less6 {
    public static void main(String[] args){
     //                            Умножение матриц!
//        int[][] arr1= {
//                {3 ,2 ,8 ,1},
//                {5, 1, 0, 10},
//                {0 ,1 ,9 ,0},
//                {3 ,4 ,1 , 1}};
//
//        int[][] arr2={
//                {3 ,1 ,0 ,5},
//                {4 ,3 ,1 ,0},
//                {3 ,3 ,1 , 0}};
//
//        int m = arr1.length;
//        int n = arr2[0].length;
//        int o = arr2.length;
//
//
//
//        int [][] result = new int[m][n];
//
//        for (int i=0; i<m;i++){
//            for (int j=0;j<n;j++){
//                for (int k = 0;k<o;k++) {
//                    result[i][j] += arr1[i][k]*arr2[k][j];
//                }
//            }
//        }
//
//        for (int [] arr : result) {
//            System.out.println(Arrays.toString(arr));
//        }

//ДИООГОНАЛИ
        int[][] arr1 =
                { {3, 0, 1},
                { 5, 0, 10},
                { 0, 9, 0} };

        for (int i =0; i<arr1.length;i++) {
            System.out.println(arr1[i][i]+ " ");
        };
        for (int i=0;i < arr1.length;i++){
            System.out.println(arr1[i][arr1.length - i -1 ] + " ");
        };





    }
}
