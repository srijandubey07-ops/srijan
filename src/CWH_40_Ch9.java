class MyEmployee {
    int id;
    private String  name;
    public String getName(){
        return name;
    }


    public void setName(String n) {
        name = n;

    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

}

public class CWH_40_Ch9 {

   public static void main(String[] args) {

       MyEmployee Srijan = new MyEmployee();
       //Srijan.id =45;
       //Srijan.name = "Srijan Dubey";   --> throw an error due to privet acess modifire
       Srijan.setName("Srijan Dubey");
       System.out.println(Srijan.getName());
       Srijan.setId(45);
       System.out.println(Srijan.getId());
    }
}
