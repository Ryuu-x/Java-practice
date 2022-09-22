// constructor using private class

class Main {

  int x, y, z;
  private Main() {
    x = 5;
    y = 10;
    z = x + y;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) 
  {
    Main obj = new Main();
    System.out.println("x + y: " + obj.z);
  }
}