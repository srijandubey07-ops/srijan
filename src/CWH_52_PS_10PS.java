class Rectangle{
    public int Length;
    public int Breath;

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getBreath() {
        return Breath;
    }

    public void setBreath(int breath) {
        Breath = breath;
    }

    Rectangle(int l , int b){
        System.out.println("i am rectangle parameter construtor");
        this.Length = l;
        this.Breath = b;

    }
    public double area (){
        return Length*Breath;
    }
}
class Cubiod extends Rectangle{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cubiod(int l , int b, int h){
        super(l,b);
        System.out.println("i am cubiod parameter construtor");
        this.height= h;
    }
    public double volume() {
        return Length*Breath*height;
    }
}

//class Rectangle{
//    public int Length;
//    public int Breath;
//    Rectangle(int l ,int b){
//        System.out.println("i am rectangle parameter construtor");
//        this.Length = l;
//        this.Breath = b;
//
//    }
//    public double area (){
//        return Length*Breath;
//    }
//}
//class Cubiod extends Rectangle{
//    public int height;
//    Cubiod(int l , int b, int h){
//        super(l,b);
//        System.out.println("i am cubiod parameter construtor");
//        this.height= h;
//    }
//    public double volume() {
//        return Length*Breath*height;
//    }
//}


/*class Circle{
    public int radidus;
    Circle(int r){
        System.out.println("i am circle parameter construtor");
        this.radidus =r;
    }
    public double area(){
        return Math.PI*this.radidus*this.radidus;
    }
}
class Cylinder extends Circle{
    public int hight;
    Cylinder(int r , int h){
        super(r);
        System.out.println("i am circle Cylinder parameter construtor");
        this.hight = h;

    }

    public double volume(){
        return Math.PI*this.radidus*this.radidus*hight;
    }
}

 */
public class CWH_52_PS_10PS {
    public static void main(String[] args) {
     /*
       // Circle objc =  new Circle(12);
        Cylinder objC = new Cylinder(12,13);


     */

        // problam 2
//       Rectangle Rectnlgle = new Rectangle(12,13);
//       Cubiod cubiod = new Cubiod(13,14,15);

// problam 4
        Rectangle Rectangle = new Rectangle(12,13);
        Rectangle.setLength(12);
        Rectangle.setBreath(14);
        Cubiod cubiod = new Cubiod(12,13,14);
        cubiod.setLength(12);
        cubiod.setBreath(14);
        cubiod.setHeight(15);











    }
}
