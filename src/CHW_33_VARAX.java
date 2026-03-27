public class CHW_33_VARAX {
//    static int sum (int a, int b){
//        return a+b;
//    }
//    static int sum (int a, int b, int c){
//        return a+b;
//    }
    static  int sum (int x , int ...arr){
        // available as int [] arr;
        int result = x;
        for (int a: arr){
            result +=a;

        }
        return result;
    }
   public static void main(String[] args) {
       System.out.println("welcome to verargs tutorial ");
//       System.out.println("the sum is nothing is " +sum());
       System.out.println("the sum of 1 is :  " +sum(1));
       System.out.println("the sum of 4 and 5 is  " + sum(4,5));
       System.out.println("the sum of 4 and 5 is  " + sum(4,5, 7));
       System.out.println("the sum of 4 and 5 is  " + sum(4,5, 7));


    }
}
