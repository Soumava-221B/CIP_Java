import java.io.*;
// class BufferedReader_ex {
//   public static void main(String[] args) throws IOException{
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     System.out.println("Enter a String");
//     String s = br.readLine();
//     System.out.println("You Entered "+s);
//   }
// }

class BufferedReader_ex {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter an Integer");
    int x = Integer.parseInt(br.readLine());
    System.out.println("You Entered "+x); 
  }
}