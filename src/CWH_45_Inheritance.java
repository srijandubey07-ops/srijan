class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and  setting x now");
        this.x = x;
    }
    public void printeme(){
        System.out.println("I am constutor");
    }
}
class derive extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CWH_45_Inheritance {
     public static void main(String[] args) {
         // creating an obeject of base class
         base b = new base();
         b.setX(4);
         System.out.println(b.getX());
         // crating an obeject of derive class
       derive d = new derive();
       d.setX(45);
         System.out.println(d.getX());

         // for int y
              d.setY(45);
         System.out.println(d.getY());


    }
}
