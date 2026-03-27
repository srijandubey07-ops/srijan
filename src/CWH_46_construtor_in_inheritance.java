class base1{
    base1(){
        System.out.println("I am a construtor");
    }
    base1(int x ){
        System.out.println("I am an overlode construtor with value of y as: " +x);
    }

}
class  Derive1 extends base1{
    Derive1(){
       // super(0);
        System.out.println("I am a derive class  construtor");
    }
    Derive1(int x , int y){
        super(x);
        System.out.println("I am an overlode construtor with value of y as: " + y);
    }

}
class ChildOfDerive extends Derive1{
    ChildOfDerive(){
        System.out.println("i am child of derived constructor");
    }
    ChildOfDerive(int x , int y , int z){
        super(x,y);
        System.out.println("I am an overlode construtor of Derive  with value of z as: " + z);
    }
}


public class CWH_46_construtor_in_inheritance {
    public static void main(String[] args) {
       // base1 b = new base1();
       // Derive1 d = new Derive1();
       // Derive1 d = new Derive1(14 , 39);
        ChildOfDerive cd = new ChildOfDerive(12,13,14);


    }
}
