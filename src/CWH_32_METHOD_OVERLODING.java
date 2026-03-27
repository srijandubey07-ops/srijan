public class CWH_32_METHOD_OVERLODING {
    static void foo(){
        System.out.println("good morning bro ");
    }
    static void foo(int a){
        System.out.println("good moring " + a +" bro");
    }
    static void foo(int a, int b ){
        System.out.println("good moring " + a +" bro");
        System.out.println("good moring " + b +" bro");
    }



    static void change (int a ){
        a = 98;

    }
    static  void  change2 (int [] arr){
        arr[0] = 98;
    }
    static void telljock(){
        System.out.println("i am topper");

    }

     public static void main(String[] args) {
       // telljock();

         // case 1 change the interger
        // int x = 45;
        // change(x);
        // System.out.println(" the value of x after runing change is :- "  + x);

// change the array
     //    int [] marks = {76,86,75,89};
      //   change2(marks);
    //     System.out.println("the value of x after runing change is : " + marks[0]);

// method overloding
         foo();
         foo(2000);
         foo(3000,40000);
         // argument are actual!

    }
}
