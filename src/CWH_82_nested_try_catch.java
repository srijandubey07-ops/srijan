import java.util.Scanner;

public class CWH_82_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("welocom to video no 82");
                try {
                    System.out.println(marks[ind]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry the exception does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("thanks for using this program");
    }
}