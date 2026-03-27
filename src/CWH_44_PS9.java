


//class Cylinder {
//    private int radius;
//    private int height;
//
//    // Getter for radius
//    public int getRadius() {
//        return radius;
//    }
//
//    // Setter for radius
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public Cylinder(int height, int radius) {
//        this.height = height;
//        this.radius = radius;
//    }
//
//    // Getter for height
//    public int getHeight() {
//        return height;
//    }
//
//    // Setter for height
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public double surface_area(){
//        return 2*3.14*radius*radius+2*3.14*radius*height;
//    }
//    public double volume(){
//        return Math.PI*radius*radius*height;
//    }
//
//}
class rectangle{
    public rectangle() {
        this.lenght = 4;
        this.breadth = 5;
    }

    public rectangle(int breadth, int lenght) {
        this.breadth = breadth;
        this.lenght = lenght;
    }

    private int lenght;
    private  int breadth;

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }
}








public class CWH_44_PS9 {

    public CWH_44_PS9() {
    }

    // problam 1
    public static void main(String[] args) {
       /* Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(5);

        System.out.println("Height: " + myCylinder.getHeight());
        System.out.println("Radius: " + myCylinder.getRadius());

     */
        // problam 2
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(5);
//        System.out.println(myCylinder.surface_area());
//        System.out.println(myCylinder.volume());

        //  PROBLAM 3
//        Cylinder myCylinder = new Cylinder(12,9);
//        System.out.println(myCylinder.surface_area());
//        System.out.println(myCylinder.volume());

        // problam 5
rectangle r = new rectangle(12,16);
        System.out.println(r.getBreadth());
        System.out.println(r.getLenght());

    }
}