package Java.Day04array;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        int[] arr1 = {1,2,454,5};
        int len = arr1.length;

        for(int num:arr){
            System.out.println(num);
        }

        int[][] arr2 = new int[3][3];
        
        int[][] matrix= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

        int[] primes;
        primes = new int[]{2,3,5,7};
        
        for (int i : primes) {
            System.out.println(i);
        }


    }
}
