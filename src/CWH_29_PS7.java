public class CWH_29_PS7 {
    public static void main(String[] args) {
        // problam 1
//        float[] marks = {47.5f , 56.8f , 77.6f , 99.7f , 88.7f};
//        float sum =0;
//        for (float element : marks ){
//            sum = sum+element;
//
//        }
//       System.out.println("the value of sum is:-  " +sum);

        //problam 2
//        float[] marks = {47.5f, 56.8f, 77.6f, 99.7f, 88.7f};
//        float num = 56.8f;
//        boolean isArray = false;
//        for (float element : marks) {
//            if (num == element) {
//                isArray = true;
//                break;
//            }
//        }
//        if (isArray) {
//            System.out.println("the value is present in array");
//        }
//        else {
//            System.out.println("the value is not prensent in array");
//        }
        // problam 3
//        float[] marks = {47.5f , 56.8f , 77.6f , 99.7f , 88.7f};
//          float sum =0;
//             for (float element : marks ) {
//                 sum = sum + element;
//             }
//        System.out.println("the value of average marks is:   " + sum/marks.length);

        // problam 4
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        int[][] matrix2 = {
//                {7, 8, 9},
//                {10, 11, 13}
//        };
//
//        int[][] result = new int[2][3];
//
//// Add matrices
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.format("Setting value for i = %d and j = %d \n", i, j);
//                result[i][j] = matrix[i][j] + matrix2[i][j];
//            }
//        }
//
//// Print result
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
        // problam 5
//        int [] arr = { 1,2,3,4,5,6,7};
//        int l = arr.length;
//        int a = Math.floorDiv(l,2);
//        for (int i = 0; i<a ; i++ ){
//            // swap a[i] = a[l-1-i]
//            // a b temp
//
//            int temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = arr[temp];
//
//        }
//        for (int element : arr){
//            System.out.print(element + " ");
//        }
        // problam 6
//        int [] arr = { 1,2,3,4,5,6,7};
     //         int max = Integer.MAX_VALUE;
//        for (int e: arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is : "  + max);

                // problam 7
//        int [] arr = { 1,2,3,4,5,6,7};
          //  int min = Integer.MIN_VALUE
//        for (int e: arr){
//            if (e<min){
//                min=e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is : "  + min);

        // problam 8
        boolean isSorted = true;
       int[] arr = {1,5,3,6,3,8,2};
       for (int i = 0; i<arr.length-1; i++){
           if (arr[i]>arr[i+1]){
               isSorted = false;
               break;
           }
       }
       if (isSorted){
           System.out.println("the Array is shorted");
       }
       else{
           System.out.println("the Array is not shorted");
       }




    }
}