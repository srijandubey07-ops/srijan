import java.util.Scanner;

public class CWH_23_FOR {
    static void main(String[] args) {
//        for (int i = 1; i<=10; i++){
//
//            System.out.println(i);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = n ; i>=0; i--){
            System.out.println(2*i+1);
        }
        }
    }

