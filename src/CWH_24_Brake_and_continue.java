public class CWH_24_Brake_and_continue {
    static void main(String[] args) {
        // breake and contiune using loop
//        for (int i = 0 ; i<5; i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i ==2){
//                System.out.println("ending the loop");
//                break;
//        int i =0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("java is grade program");
//            if (i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }

//        int i =0;
//        do {
//            System.out.println(i);
//            System.out.println("java is grade program");
//            if (i == 2) {
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }    while (i < 5) ;
//        System.out.println("loop end here");

        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                System.out.println("ending the loop");
                continue;


            }
            System.out.println(i);
            System.out.println("java is great");
        }

    }
}