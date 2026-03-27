import java.util.Scanner;

public class CWH_06_EXERISE1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Math marks");
        float Math = sc.nextFloat();
        System.out.println("enter the Chemistry marks");
        float Chemistry = sc.nextFloat();
        System.out.println("enetr the Physics marks");
        float Physics = sc.nextFloat();
        System.out.println("enter the English marks");
        float English = sc.nextFloat();
        System.out.println("enter the Music marks");
        float Music = sc.nextFloat();
        System.out.println("total percentage");
        float percentage = ((Math+Physics+English+Music+Chemistry)/500)*100;
        System.out.println(percentage);

    }
}
