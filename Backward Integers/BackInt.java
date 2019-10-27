import java.util.Scanner;
class BackInt{
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String answer = "Y";

    while (answer.equals("Y"))
    {
      int response=0;
      while (response<1000)
      {
        System.out.println("Please input an integer that has at least 4 digits!");
        response = scan.nextInt();
      }
      while (response>0)
      {
        System.out.print(response%10);
        response/=10;
      }
      System.out.println("\nAgain? Y or N");
      answer = scan.next();
    } 
}
}