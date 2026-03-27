class phone {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}

class smartphone extends phone {   // Inheritance added
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    }
}

public class CWH_49_Dyanamic_method_dispatch {
    public static void main(String[] args) {

        phone obj = new smartphone();   // Allowed (Upcasting)

        obj.greet();   // From phone class
        obj.name();    // From smartphone class (Runtime Polymorphism)

        // obj.swagat(); ❌ Not allowed (Reference type is phone)
    }
}