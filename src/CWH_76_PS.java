
class pratice13 extends Thread{
   public void run(){
        while (true){
            System.out.println("thank you :  ");
        }
    }
}
class pratice13b extends Thread{
    public void run(){
        while (true){
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("good morning :  ");
        }
    }
}
public class CWH_76_PS {
    public static void main(String[] args) {
        pratice13 p  = new pratice13();
        pratice13b pb = new pratice13b();
        p.start();
        pb.start();
    }
}
