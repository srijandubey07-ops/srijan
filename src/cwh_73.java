 class  mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you");
//        while(true){
//            System.out.println("i am thrad");
//        }
    }
 }
public class cwh_73 {
    public static void main(String[] args) {
        mythr mythr = new mythr("mythr");
        mythr mythr2 = new mythr("mythr");
        mythr.start();
        System.out.println("the id of thred t is "+ mythr.getId());
        System.out.println("the id of thred t is "+ mythr.getName());
        System.out.println("the id of thred t is "+ mythr2.getId());
        System.out.println("the id of thred t is "+ mythr2.getName());

    }
}
