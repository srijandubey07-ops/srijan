import java.util.Scanner;

class MyException1 extends Exception {
    public String toString(){
        return super.toString() + "i am to String()";
    }
    public String getMessage(){
        return super.getMessage() + "i am getMessage()";
    }

}


public class CWH_83_Exception {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<99){
            try {
//                throw new MyException1();
                throw new ArithmeticException("this is exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finsh");
            }

        }
    }
}
