import java.util.Scanner;

public class CWH_05_takinginput {
    static void main() {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1");
        int a = sc.nextInt();
        System.out.println("enter the number2");
        int b = sc.nextInt();
        System.out.println("enter the  number3");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("the sum of three number    " + sum);
        boolean b1 =sc.hasNextInt();
        System.out.println(b1);
    }
}
