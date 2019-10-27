class Dealer {
  private int cpuscore;
  private int userscore;
  private String cpuoutput;

  //Sets up the game.
  public Dealer() {
    System.out.println("CPU: ");
    //Call the starting hand method with the parameter “CPU”
    startinghand("CPU");
    System.out.println("User: ");
   //Call the starting hand method with the parameter “User”	
   startinghand("User");
   
  }

  //Sets the starting hands up
  public void startinghand(String player) {
    // Get two random cards between the value of 2-13 using (int) and Math.random()

    int card1 = (int)(Math.random()*12+2);
    int card2 = (int)(Math.random()*12+2);
    
    String sentence = "The first card is: ";

   //Change card1 to a max of 10 and adds it to the printed statement
    if (card1 > 10) {
      card1 = 10;
      sentence = sentence + "a face card (10)";
    } else
      sentence = sentence + card1;
    if (player == "CPU")
      System.out.println(sentence);
    
    //Change card2 to a max of 10 and adds it to the printed statement
    sentence = sentence + ". The second card is: ";
    if (card2 > 10) {
      card2 = 10;
      sentence = sentence + "a face card (10).";
    } else
      sentence = sentence + card2 + ".";

    // Setting scores based on which player
    if (player == "CPU") {
      cpuscore = card1 + card2;
      cpuoutput = "CPU drew a " + card1 + " and a " + card2;
    } else {
      userscore = card1 + card2;
      System.out.println(sentence);
    }
  }


  //Allows CPU and User to draw extra cards
  public int hit(String player) {
    if (player == "User") {
      //Draw random card
      int card1 = (int) (12 * Math.random()) + 2;
      //Set it to a max of 10
      if (card1 > 10) {
        card1 = 10;
      }
      System.out.println("You drew a " + card1);
      userscore = userscore += card1;
      System.out.println("Your score is now " + userscore);
      return userscore;
    }

    else {
      //Has CPU draw if current score is 14 or lower.
      while (cpuscore < 13) {
        int card1 = (int) (12 * Math.random()) + 2;

        if (card1 > 10) {
          card1 = 10;
        }
        cpuscore = cpuscore += card1;
        cpuoutput = cpuoutput + " and a " + card1;

      }
      System.out.println(cpuoutput);
      return cpuscore;
    }
  }
  //returns current user score
  public int userscore() {
    return userscore;
  }
  //returns current cpu score
  public int cpuscore() {
    return cpuscore;
  }
}



