import java.util.Scanner;

public class CWH_79_errordemo {
    public static void main(String[] args)  {
        // syntax error
        // int a =3   // eroor no semicoloum
        // b = 5 ; // error b is not deleclare


        // logical error demo
        // write a program to print all prime number
//        System.out.println(2);
//        for (int i = 1; i<5; i++){
//            System.out.println(2*i+1);
//        }
        // run time error
        int k ;
        Scanner sc = new Scanner(System.in);
       k = sc.nextInt();
        System.out.println("interger part of 1000 divide by k is :--   " + 1000/k);
    }
}
