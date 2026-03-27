class  mythr1 extends Thread {
    public mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        while (true) {
            System.out.println("thank you :  " + this.getName());
        }
    }
}
public class cwh_74 {
    public static void main(String[] args) {
        // ready queue t1, t2, t3, t4

        mythr1 t1 =  new mythr1("a");
        mythr t2 =  new mythr("j");
        mythr t3 =  new mythr("i");
        mythr t4 =  new mythr("r");
        mythr t5 =  new mythr("s");
        mythr t6 =  new mythr("thank you");
        mythr t7 =  new mythr("shiju");

        mythr t8 =  new mythr("srijan");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t5.start();
        t6.start();
        t7.start();
        t8.start();




    }
}
