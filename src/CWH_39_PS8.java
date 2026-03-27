//class  Employee1{
//    int Sallary ;
//    String name;
//
//    public int getSallary(){
//        return Sallary;
//    }
//    public String getName(){
//        return  name;
//    }
//    public void  setName(String n){
//        name = n;
//    }
//}

/*class  Cellphone {
    public void ringing(){
        System.out.println("ringing ......");
    }
    public  void vibrating(){
        System.out.println("vibrating......");
    }
    public  void CallFriend (){
        System.out.println("calling nibu beta......");
    }
}

 */
//class Squre{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int Perimeter(){
//        return 4*side;
//    }
//}

//    class rectangle {
//        int Length;
//        int Breathe;
//        public int area(){
//            return Length*Breathe;
//        }
//        public int perimeter(){
//            return 2*(Length+Breathe);
//        }
//    }
//class Tommy{
//    public void hit(){
//        System.out.println("hiting the enemy");
//    }
//    public void runing(){
//        System.out.println("runing from  the enemy");
//    }
//    public void firing(){
//        System.out.println("firing on the enemy");
//    }
//
//}

class circle {
    float redius;
    public float area(){
        return 3.14f*redius*redius;
    }
    public float perimeter(){
        return 3.14f*redius*2;
    }
}


public class CWH_39_PS8 {
   public static void main(String[] args) {
        // problam 1
//       Employee1 Srijan  = new Employee1();
//       Srijan.setName("Srijan Dubey");
//       Srijan.Sallary =30;
//       System.out.println(Srijan.getSallary());
//       System.out.println(Srijan.getName());

       // problam 2
    /*   Cellphone vivoT3lite = new Cellphone();
       vivoT3lite.CallFriend();
       vivoT3lite.vibrating();
       vivoT3lite.ringing();

     */

       // problam 3

//       Squre CalculatingSqure = new Squre();
//       CalculatingSqure.side= 16;
//       System.out.println(CalculatingSqure.area());
//       System.out.println(CalculatingSqure.Perimeter());

       // problam 4
//       rectangle rect = new rectangle();
//       rect.Length = 16;
//       rect.Breathe = 19;
//       System.out.println(rect.area());
//       System.out.println(rect.perimeter());
   // problam 5
//       Tommy Player1 = new Tommy();
//       Player1.firing();
//       Player1.hit();
//       Player1.runing();

       // problam 6
       circle circle = new circle();
       circle.redius = 6.9f;
       System.out.println(circle.area());
       System.out.println(circle.perimeter());


    }
}
