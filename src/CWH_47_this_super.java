class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a = v;
    }
    public int returnon(){
        return 1;
    }
}
class  DoClass extends EkClass{
    DoClass(int c ){
        super(c);
        System.out.println("i am a constrcutor");
    }
}



public class CWH_47_this_super {
    public static void main(String[] args) {
        EkClass E = new EkClass(5);
        DoClass D = new DoClass(45);
        System.out.println(E.getA());
    }
}
