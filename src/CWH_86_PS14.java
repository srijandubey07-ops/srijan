import java.util.Scanner;

public class CWH_86_PS14 {
    public static void main(String[] args) {
        // PROBLAM1
//        // syntax error --- int a =7
//        int age = 70;
//        int yearborn = 2000-78; // logical error
//        System.out.println(6/8);
//        // problam 2
//        try {
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("hehe");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("hihi");
//        }
        // problam 3
        boolean falg  = true;
        int [ ] marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
        while (falg && i<5) {
            try {
                System.out.println("enter the value of index");

                index = sc.nextInt();
                System.out.println("the value of index is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("invalid input");
                i++;
            }
        }
    }
}
