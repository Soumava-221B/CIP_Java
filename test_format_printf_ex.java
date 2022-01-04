class test_format_printf_ex {
  public static void main(String[] args){
    int x = 100, y=200;
    System.out.format("Value of x is %d\n",x);
    double Y=Math.PI;
    System.out.println(Y);
    System.out.format("Value of PI = %.2f\n",Y);
    System.out.format("Value of PI = %5.2f\n",Y);
    System.out.format("Value of PI = %05.2f\n",Y);
    System.out.printf("x=%d, y=%d",x,y);
  }
}