// contructor using public class

class First {
  String name;
  public First() {
    name = "Akarsh";
  }

  public static void main(String[] args) 
  {
      
    First obj =  new First();
    System.out.println("First name = " + obj.name);
  }
}