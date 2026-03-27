class Mythread  extends Thread {
    public void run() {
        int i=0;
        while (i<40000) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class Mythread2  extends Thread {
    public void run() {
        int i=0;
        while (i<40000) {
            System.out.println("my thread2 is running");
            System.out.println("i am sad");
            i++;
        }
    }
}
public class CWH_70 {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Mythread2 mythread2 = new Mythread2();
        mythread.start();
        mythread2.start();
    }
}
