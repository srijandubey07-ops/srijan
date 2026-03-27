import java.util.Scanner;

public class CWH_81 {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");

         int ind = sc.nextInt();

        System.out.println("enter the numberyou want to devide the value with");

        int number = sc.nextInt();
        try {
            System.out.println("the value of array index entered is : " + marks[ind]);
            System.out.println("the value of array-value / number is " + marks[ind] / number);
        } catch (ArithmeticException e) {

            System.out.println("some exection occues");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e) {

            System.out.println("some exection occues");
            System.out.println(e);
        }
    }
}
