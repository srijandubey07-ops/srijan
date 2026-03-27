//abstract class pan{
//    abstract void write();
//    abstract void refill();
//}
//class FountainPan extends pan{
//    void write(){
//        System.out.println("write");
//    }
//    void refill(){
//        System.out.println("refill");
//    }
//    void changeNib(){
//        System.out.println("changing the nib");
//    }
//}
//class monkey{
//    void jump(){
//        System.out.println("jump");
//    }
//    void bite(){
//        System.out.println("bitinggg");
//    }
//}
//interface basicAnimal{
//    void eat();
//    void sleep();
//}
//class human extends monkey implements basicAnimal {
//    void speak(){
//        System.out.println("Heloow sir");
//    }
//    public void eat(){
//        System.out.println("eat");
//    }
//    public void sleep(){
//        System.out.println("sleep");
//    }
//}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone1 extends telephone{
    void ring(){
        System.out.println("smartphone ring");
    }
    void lift(){
        System.out.println("smartphone lift");
    }
    void disconnect(){
        System.out.println("smartphone disconnect");
    }
}

public class CWH_60_Ch11_ps {
    public static void main(String[] args) {
//        FountainPan fp = new FountainPan();
//        fp.write();
//        fp.refill();
//        fp.changeNib();
        // problam 2
//        human Srijan = new human();
//        Srijan.speak();

        // problam 5
//        monkey m1 = new human();
//        m1.bite();
//        m1.jump();
//      //  m1.speak ; --> cannot be speak method  because the  reference is monkey does not have speak method
//        basicAnimal lovish = new human();
//        // lovish.speak(); --> error
//        lovish.eat();
//        lovish.sleep();

        // problam 4
        telephone obj = new smartphone1();
        obj.ring();
        obj.lift();
        obj.disconnect();
    }
}
