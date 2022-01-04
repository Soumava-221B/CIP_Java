// Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

class Autoboxing{
  public static void main(String args[]){
    int x1 = 10;
    Integer x2 = x1;
    int x3 = x2;
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);

    // Integer x1 = 400, x2 = 400;
    // if(x1==x2)
    // System.out.println("Same");
    // else
    // System.out.println("Not Same");

    //Since x1 and x2 are references to a the object. So they are different objects and refer to different things. Hence the o/p is Not Same 
  }
}