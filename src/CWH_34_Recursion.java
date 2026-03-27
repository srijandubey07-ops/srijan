public class CWH_34_Recursion {

//        // factrial(n) = n*n-1*......1
//        // factorial(n) = n*factorial(n-1)
//        static int factorial(int n){
//            if (n==0 || n==1){
//                return 1;
//            }
//            else {
//                return n*factorial(n-1);
//            }
//    }
//    public static void main(String[] args) {
//            int x = 4;
//        System.out.println("the value of factorial is  " + factorial(x));

    // itrative function

    static int factorial(int n){
          if (n==0 || n==1){
                return 1;
            } else {
                     return n*factorial(n-1);
            }
          }
    static int factorial_irative(int n){
        if (n==0 || n==1){
            return 1;
        } else {
            int product = 1;
            for (int i =1 ; i<=n; i++){
                product*=i;

            }
            return product;
        }
    }

       public static void main(String[] args) {
        int x =4;
           System.out.println("the value of factorial is  " + factorial_irative(x));

}
    }

