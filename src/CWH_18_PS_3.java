import java.util.Scanner;

public class CWH_18_PS_3 {
    static void main(String[] args) {
        // problam 1
        // solution is error
//        int a = 10;
//        if (a=11){
//            System.out.println("you are 11");
//        }
//        else {
//            System.out.println("you are 10");
//        }
        // problam 2
//        byte m1, m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your marks in physics");
//        m1 = sc.nextByte();
//
//        System.out.println("enter your marks in Chemistry");
//        m2 = sc.nextByte();
//        System.out.println("enter your marks in Math");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.f;
//        System.out.println("overall percentage   " + avg);
//        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratutions , you have been promated");
//        }
//        else {
//            System.out.println("sorry you have not be promated , try again");
//        }

        // problam  3
//        System.out.println("enter your income");
//        Scanner sc = new Scanner(System.in);
//        float income = sc.nextFloat();
//        float tax = 0;
//        if (income<2.5){
//            tax= tax+0;
//
//        }
//         if (income>2.5){
//             tax = tax + 0;
//         }
//         else if (income<2.5&&income<5f){
//             tax = tax +0.05f*(income-2.5f);
//         }
//        else if (income<5f&&income<10f){
//            tax = tax +0.05f*(5.0f-2.5f);
//            tax = tax +0.2f*(income-5f);
//        }
//         else if (income<10.0f){
//             tax = tax +0.05f*(5.0f-2.5f);
//             tax = tax + 0.2f * (10.f - 5f);
//             tax = tax +0.3f*(income-10.0f);
//         }
//        System.out.println("total tax paid by employy"+ tax);
//
//

        // Question 4
//        Scanner sc = new Scanner(System.in);
//
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("satday");
//            case 7 -> System.out.println("sunday");
      // Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the year");
//        int year = sc.nextInt();
//        if (year%4==0 && year%400==0){
//            System.out.println("leap year");
//
//        } else if (year%100==0) {
//            System.out.println("not leap year");
//
//        }
//        else {
//            System.out.println("not leap year");
//        }

        // Question 5
        System.out.println("enter the website name");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("it is organization website");
        } else if (website.endsWith(".com")) {
            System.out.println("it is comarsial website");

        }
       else if(website.endsWith(".in")){
            System.out.println("it is indian website");
        }
    }



    }

