public class CWH_85_Finally {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 20;
            int c = a / b;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("this is end of program");
        }
    }
}

