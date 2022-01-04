class Point{   // This point class has two members x and y
  int x;
  int y;
}
class Test{
  public static void main(String[] args)
  {
    // Point is a non-primitive data type
    // create a variable of non-primitive type using new operator
    Point p = new Point();  
    p.x = 10; // Access the non-primitive variable using ' . ' operator
    p.y = 20;
    System.out.println(p.x+" "+p.y);
  }
}

// Non-Primitive Type variables are always refernces
// class Point{ 
//   int x;
//   int y;
// }
// class Test{
//   public static void main(String[] args)
//   {
//     Point p1 = new Point();  
//     p1.x = 10;
//     p1.y = 20;
//     Point p2 = p1;
//     p2.x = 30;
//     System.out.println(p1.x);
//     System.out.println(p2.x);
//   }
// }

//Primitive variable is not refernces

// class Test{
//   public static void main(String[] args)
//   {
//     int x1 = 10, x2 = 20;
//     x2 = 20;
//     System.out.println(x1);
//     System.out.println(x2);
//   }
// }