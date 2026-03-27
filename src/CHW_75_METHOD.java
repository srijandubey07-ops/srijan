class  mythr2 extends Thread {
    public mythr2() {
        super();
    }

    public void run() {
        int i = 0;
        while (i<200) {
            System.out.println("thank you :  " );
            i++;
        }
    }
}
class mythr3 extends Thread {
    public void  run(){

        System.out.println(" my thank you :  ");
    }
}
public class CHW_75_METHOD {
    public static void main(String[] args) {
        mythr2 th2 = new mythr2();
        mythr3 th3 = new mythr3();
        th2.start();
        try {
            th2.join();
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        th3.start();

    }
}
