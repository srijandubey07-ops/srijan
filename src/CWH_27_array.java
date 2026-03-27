public class CWH_27_array {
    static void main(String[] args) {
       // int[] marks = {100,45,54,56,76};
//        float [] marks = {98.1f, 67.3f, 56.4f , 67,89f, 56,57f};
//        String [] studends = {"harry", "Srijan", "aman", "niraj,"};
//        System.out.println(marks.length);
//        System.out.println(studends.length);
         int[] marks = {100,45,54,56,76};
//        System.out.println(marks.length);
        // Displacing the array (noice way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);

        // Displacing the array  for loop
        System.out.println("printing using for  loop");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        // Displacing the order in reverse loop
        System.out.println("printing using for for revrse loop");
        for (int i = marks.length-1; i>=0 ; i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing using for each loop");
        for (int element : marks){
            System.out.println(element);
        }

    }
}
