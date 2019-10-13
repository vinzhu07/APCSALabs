import java.util.Scanner;

class Blackjack{
  public static void main(String[] args) {
    //Instantiate starter variables
    Scanner scan = new Scanner(System.in);
    int userscore = 0;
    int cpuscore = 0;
    String response = "H";
    boolean lose = false;
    //Set up the initial starting positions
    System.out.println("Welcome to the game of blackjack!");
    Dealer deal = new Dealer();
    
    //Prompt user to hit or fold
    System.out.println("Would you like to hit or fold? H  or F only");
    response = scan.next();
    
    //for loop to run as long as response is equal to “H”
    while (response.equals("H"))
    {
	//check is response is equal to “H”
      if (response.equals("H"))
        userscore = deal.hit("User");
      if (userscore > 21) {
        lose = true;
        System.out.println("You lost!");
        response = "F";
      } else {
        System.out.println("Would you like to hit or fold? H  or F only");
        response = scan.next();
      }
    }

    if (userscore < 21) {
      cpuscore = deal.hit("CPU");
    }

    userscore = deal.userscore();
    cpuscore = deal.cpuscore();
    System.out.println("The CPU got " + cpuscore);
    System.out.println("You got " + userscore);
    if (lose == false) {
      if (userscore == 21)
        System.out.println("Congrats you hit blackjack!");
      else if (userscore > cpuscore)
        System.out.println("Congrats you won!");
      else if (cpuscore > userscore)
        System.out.println("You lose!");
      else
        System.out.println("Tie!");
    }
  scan.close();
  }
}
