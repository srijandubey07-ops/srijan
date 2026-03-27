abstract class parent2{
    public  parent2(){
        System.out.println("main base 2 ka construtor hu ");
    }
    public void SayHellow(){
        System.out.println("Hellow");
    }
    abstract public void greet();

}

class child extends  parent2{
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}
abstract class child2 extends  parent2{
    public void th() {
        System.out.println("good morning");
    }
}

public class CWH_53_Abstract {
    public static void main(String[] args) {

    }
}
