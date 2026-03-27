public class CWH_35_PS7 {
    // PROBLAM 1
//    static void multiplication(int n){
//        for (int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n " , n , i ,n*i);
//        }
//    }
//    public static void main(String[] args) {
//        multiplication(7);
//    }

    // problam 2
//    static void pattarn1 (int n){
//        for (int i =0 ; i<n; i++){
//            for (int j =0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }
//
//   public static void main(String[] args) {
//
//       pattarn1(4);
//    }
    // problam 3
    // sum(n) = 1+2+3+4+5+....................n
    // sum(n) = 1+2+3+4+5+....................n-1+n
    // sum(n) = sum(n-1) +sum(1)


//    static int sumRect(int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n+sumRect(n-1);
//        }
//    }
//    public static void main() {
//        int c = sumRect(4);
//        System.out.println(c);
//    }
//    static void pattern1(int n){
//        for (int i = 0; i<n; i++){
//            for (int j=n;j>i ;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        pattern1(4);
//    }
    // problam 5
    //The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
    // typically starting with 0 and 1.
    // The sequence begins: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
//        static int fib(int n){
//           /* if (n==1){
//                return 0;
//            } else if (n==2) {
//                return 1;
//            }
//
//            */
//            if (n==1||n==2){
//                return n-1;
//            }
//            else {
//                return fib(n-1)+ fib(n-2);
//            }
//        }
//       public static void main(String[] args) {
//           int result = fib(2);
//           System.out.println(result);
//       }

    // problam 6
//    static int avg(int...arr){
//        int sum = 0;
//        for (int a:arr){
//        sum+=a;
//        }
//       return sum/arr.length;
//    }
//public static void main() {
//    System.out.println("the avg of the number is " +avg(3,3,3));
//}

    // problam 7
//
//    static void pattern(int n) {
//        if (n == 0) {
//            return;
//        }
//
//        printStars(n);
//        System.out.println();
//
//        pattern(n - 1);
//    }
//
//    static void printStars(int n) {
//        if (n == 0) {
//            return;
//        }
//
//        System.out.print("*");
//        printStars(n - 1);
//    }
//
//    public static void main(String[] args) {
//        pattern(4);
//    }

// problam 8
//    static void pattern(int n ){
//            for (int i =0 ; i <n; i++){
//                for (int j = 0; j<i; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//
//        }
//    }
//       static void pattern1_rec(int n){
//
//        if (n>0){
//            pattern1_rec(n-1);
//            for (int i =0 ; i<=n; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//       }

//public static void main(String[] args) {
//    pattern(9);
// }
        // problam 9
//    static float calisous(float c){
//        float cal =(c * 9/5) + 32f;
//        return cal;
//
//    }
//public static void main(String[] args) {
//    System.out.println(calisous(9));
//}

// problam 10
public class Main {

    static int sumOfNaturalNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

         public static void main(String[] args) {
        int result = sumOfNaturalNumbers(5);
        System.out.println("Sum = " + result);
    }
}







}
