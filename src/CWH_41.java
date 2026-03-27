import java.util.Random;
import java.util.Scanner;

public class CWH_41 {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for peper
        // 2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock , 1 for peper , 2 for scissor");
        int userInput = sc.nextInt();
        Random rendom = new Random();
        int computerInput = rendom.nextInt(3);
        if (userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput== 0 && computerInput== 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1 ) {
            System.out.println("you win");
        }
        else {
            System.out.println("Computer win ");
        }
    }
}
