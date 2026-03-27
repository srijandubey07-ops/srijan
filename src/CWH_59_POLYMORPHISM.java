interface camera1 {
    void takeSnap();
    void recordvideo();

    default void record() {
        System.out.println("record");
    }
}

interface wifi1 {
    String[] getnetwork();
    void connectToNetwork(String network);
}

class Mycellphone1 {
    void callNumber(int Phonenumber) {
        System.out.println("Calling phone number " + Phonenumber);
    }

    void pickcall() {
        System.out.println("Picking call number");
    }
}

class Smartphone1 extends Mycellphone1 implements wifi1, camera1 {

    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordvideo() {
        System.out.println("Recording video");
    }

    public String[] getnetwork() {
        System.out.println("Getting network");
        String[] networkList = {"Srijan", "Aman", "Nibu Beta"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to network " + network);
    }
}

// Close Smartphone class properly above ☝

public class CWH_59_POLYMORPHISM {
    public static void main(String[] args) {

        // Polymorphism using interface reference
        camera1 cam1 = new Smartphone1();  // this is smartphone but use as camera

        cam1.takeSnap();
        cam1.record();   // default method
        cam1.recordvideo();

        // cam1.getnetwork(); ❌ Not allowed
        // Because reference type is camera1
        Smartphone1 sp = new Smartphone1();
        sp.callNumber(2333);
        sp.pickcall();
        sp.connectToNetwork("srijan");
        sp.takeSnap();
        sp.recordvideo();


    }
}