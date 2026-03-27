interface camera{
    void takeSnap();

    void recordvideo();
    default void record(){
        System.out.println("record");
    }

}
interface wifi{
    String [] getnetwork();
    void connectToNetwork(String network);
}
class Mycellphone{
    void callNumber(int Phonenumber){
        System.out.println("Calling phone number " + Phonenumber);
    }
    void pickcall(){
        System.out.println("Picking call number");
    }
}
class Smartphone extends Mycellphone implements wifi , camera{
  public   void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public String []  getnetwork(){
        System.out.println("Getting network");
        String [] networkList = {"Srijan", "Aman" , "Nibu Beta"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network "+ network);
    }

}public class CWH_57_Default {
    public static void main(String[] args) {

        Smartphone sp = new Smartphone();
         sp.record();
        String[] arr = sp.getnetwork();   // ✅ Correct method call

        for (String item : arr) {         // ✅ Correct for-each syntax
            System.out.println(item);
        }
    }
}
