class MyMainEmployee {
    int id;
    private String  name;

//    public MyMainEmployee(){
//        id = 45;
//        name = "Your- name- hear";
//
//    }
public MyMainEmployee(String myName, int myId){
    id = myId;
    name = myName;

}


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


public class CWH_42_Constertor {
    public static void main(String[] args) {
        MyMainEmployee Srijan = new MyMainEmployee("Srijan dubey" , 234);
        System.out.println(Srijan.getId());
        System.out.println(Srijan.getName());

    }
}
