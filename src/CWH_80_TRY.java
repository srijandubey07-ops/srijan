import java.util.Scanner;

public class CWH_80_TRY {
    public  static void main(String[] args)  {
        int a = 68000;
        int b = 0;
        // without try
//        int   c = a/b;
//        System.out.println("the result is " + c);
// with try
      try {
          int   c = a/b;
          System.out.println("the result is " + c);
      }
      catch (Exception e) {
          System.out.println("we fail to devide. reson");
          System.out.println(e);
      }
        System.out.println("end of the program");
    }
}
