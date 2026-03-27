import java.util.Scanner;

public class CWH_18_Conditonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
//
//        if (age > 56) {
//            System.out.println("You are experienced");
//        }
//        else if (age > 46) {
//            System.out.println("You are semi-experienced");
//        }
//        else if (age > 36) {
//            System.out.println("You are semi-semi experienced");
//        }
//        else {
//            System.out.println("You are not experienced");
//        }
//
//        sc.close();

        switch (age){
            case 18:
                System.out.println("you are become an adult");
                break;
            case 23:
                System.out.println("you are going to jion a job!");
                break;
            case 68:
                System.out.println("you are going to retired");
                break;
            default:
                System.out.println("enjoy your life!");
        }
    }
}
