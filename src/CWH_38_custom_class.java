class Employee{
    int id;
    int Sallary;
    String name;
    public void printDetails(){
        System.out.println("my id is  " + id);
        System.out.println("and my name is "+ name);
    }
    public int getSallary(){
        return Sallary;
    }
}

public class CWH_38_custom_class {

  public   static void main(String[] args) {
      System.out.println("this is our custom class");
      Employee Srijan = new Employee();    // Instatiating a new empolyye obeject
      Employee john = new Employee();
      // Setting Attributes Srijan
      Srijan.id = 20;
      Srijan.name= "Srijan Dubey ";
      Srijan.Sallary = 300000000;

      // Setting Attributes jone

      john.id = 13;
      john.name = "jone sexsena";
      john.Sallary = 12000000;
      // printing Attributes
      Srijan.printDetails();
      john.printDetails();
      int salary = john.Sallary;
      System.out.println(salary);
//      System.out.println(Srijan.id);
//      System.out.println(Srijan.name);
    }
}
