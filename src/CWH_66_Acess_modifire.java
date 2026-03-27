class c1 {
    public int x = 5;
    protected int y = 5;
    int z = 5;
    private int a = 5;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class CWH_66_Acess_modifire {
    public static void main(String[] args) {

        c1 obj = new c1();

        System.out.println(obj.x);  // ✅ Public - Allowed
        System.out.println(obj.y);  // ✅ Protected - Allowed (same package)
        System.out.println(obj.z);  // ✅ Default - Allowed (same package)

        // System.out.println(obj.a); ❌ Not allowed (private)
    }
}