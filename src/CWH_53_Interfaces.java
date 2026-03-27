interface Bicycle{
    int a= 45;
    void applyBrack(int decrement);
    void sppedup(int increment);
}
interface HornBicyle{
    int a= 45;
    void hornblow();
    void blowhorn();
}
class avonCyle implements Bicycle , HornBicyle{
    void blowHorn(){
        System.out.println("pee peee poooo");
    }
   public void applyBrack(int decrement){
        System.out.println("Apply brack");
    }
    public void sppedup(int increment){
        System.out.println("Apply speed");
    }
   public void hornblow(){
        System.out.println("kabi khushi kabi gum");
    }
   public void blowhorn(){
        System.out.println("lavda mera");
    }
}
public class CWH_53_Interfaces {
    public static void main(String[] args) {
        avonCyle cyle = new avonCyle();
        cyle.sppedup(1);
        cyle.applyBrack(2);
        cyle.blowHorn();
        cyle.hornblow();
        


    }
}
