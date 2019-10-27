Blackjack

Introduction

Blackjack &quot;is the American variant of a globally popular banking game known as Twenty-One&quot;. In this card game which uses a deck of 52 cards, the player plays against the dealer. The objective of the game is to win one of three different ways:

- Get 21 points total.
- Reach a final score higher than the dealer without exceeding 21
- Let the dealer draw additional cards until their hand exceeds 21 (&quot;busted&quot;).

At the start of the game, the player and dealer are both dealt two cards. The player can see both of his cards, but can only see one of the dealer&#39;s cards. If they draw a number card, then the value of the card is the number, but if they get an honor, then it is 10 points. For the sake of simplicity, aces will all be 10 points.

The player then has the option to hit or fold. Players are allowed to hit and draw another card to get closer to the number 21, but they risk getting a sum of over 21 and busting. Once the player folds, then the dealer will hit to his desire.

At the end, if someone has busted, then their opponent automatically wins. If no one busts, then the player with the higher point count wins.

Lab

The purpose of this lab is to create two classes that will allow the user to play blackjack against the computer. There will be one real class and one driver class.

The real class will contain multiple methods:

- A constructor to set up the initial state.
- A method to deal the cards and print the values to the user. Both of the user cards will get printed but only one of the dealer cards is printed.
- A method to hit, to draw a new card.
- A method that just returns the cpu score, and one that returns the user score.

Using the following skeleton code, fill in the blanks where the comments are for conditionals and other code.

Because the code is missing a multitude of conditionals and other codes, it will not compile if you copy-paste all of it, so I suggest that you type one loop or one method at a time.

**Example Run:**

Welcome to the game of blackjack!

CPU:

The first card is: 9

User:

The first card is: 9. The second card is: 4.

Would you like to hit or fold? H  or F only

H

You drew a 4

Your score is now 17

Would you like to hit or fold? H  or F only

F

CPU drew a 9 and a 10

The CPU got 19

You got 17

You lose!



**DOCUMENTATION:**

Once your code is running, submit a document showing that

- The User can win
- The CPU can win
- There can be a tie



Also submit your source code.

Label which class is the Real class.

Label which class is the Driver class.

You do not need to highlight any of the code for this lab.





public class Dealer {

  private int cpuscore;

  private int userscore;

  private String cpuoutput;

  //Sets up the game.

  public Dealer() {

    System.out.println(&quot;CPU: &quot;);

    //Call the starting hand method with the parameter &quot;CPU&quot;

    System.out.println(&quot;User: &quot;);

   //Call the starting hand method with the parameter &quot;User&quot;

  }

  //Sets the starting hands up

  public void startinghand(String player) {

    // Get two random cards between the value of 2-13 using (int) and Math.random()

    int card1;

    int card2;

    String sentence = &quot;The first card is: &quot;;

   //Change card1 to a max of 10 and adds it to the printed statement

   //Conditional statement to see if the card1 is greater than 10.

   {

      card1=10;

    //Add the string &quot;a face card (10)&quot; to the sentence variable.

    } else

     //Add the variable card1 to sentence variable

    //Check whether the parameter player is equal to &quot;CPU&quot;

      {System.out.println(sentence);}

    //Change card2 to a max of 10 and add it to the printed statement

    sentence = sentence + &quot;. The second card is: &quot;;

//Check if card2 is greater than 10

   {

      card2 = 10;

      sentence = sentence + &quot;a face card (10).&quot;;

    } else

      sentence = sentence + card2 + &quot;.&quot;;

    // Setting scores based on which player

   //Check if player is equal to &quot;CPU&quot;

    {

      cpuscore = card1 + card2;

      cpuoutput = &quot;CPU drew a &quot; + card1 + &quot; and a &quot; + card2;

    }

else

     {

      //make userscore equal to card1 and card2

      System.out.println(sentence);

    }

  }

  //Allows CPU and User to draw extra cards

  public int hit(String player) {

//check if player is equal to &quot;User&quot;

   {

      //Draw random card (same code as earlier)

      int card1;

      //Set card1 to a max of 10

      System.out.println(&quot;You drew a &quot; + card1);

     //Add card1 to userscore

      System.out.println(&quot;Your score is now &quot; + userscore);

      return userscore;

    }

   else

{

      //Has CPU draw if current score is 14 or lower.

      //For loop header which runs as long as cpuscore is under 14

{

        int card1 = (int) (12 \* Math.random()) + 2;

        if (card1 \&gt; 10) {

          card1 = 10;

        }

        //add card1 to cpuscore

        cpuoutput = cpuoutput + &quot; and a &quot; + card1;

      }

      //Print the cpuoutput and return the score of the cpu

    }

  }

    public int userscore() {

    //returns current user score

  }

  //returns current cpu score

  public int cpuscore() {

    //returns current cpuscore;

  }

}

import java.util.Scanner;

public class BlackJack {

  public static void main(String[] args) {

    //Initialize starter variables

    Scanner scan = new Scanner(System.in);

    int userscore = 0;

    int cpuscore = 0;

    String response = &quot;H&quot;;

    boolean lose = false;

    //Set up the initial starting positions

    System.out.println(&quot;Welcome to the game of blackjack!&quot;);

    Dealer deal = new Dealer();

    //Prompt user to hit or fold (&quot;H&quot; or &quot;F&quot; ) and store response to the response variable



    for(;response==&quot;H&quot;;)

    {

      if (response.equals(&quot;H&quot;))

        userscore = deal.hit(&quot;User&quot;);

//Check if userscore is greater than 21

      {

        lose = true;

        System.out.println(&quot;You lost!&quot;);

        response = &quot;F&quot;;

      } else {

        System.out.println(&quot;Would you like to hit or fold? H  or F only&quot;);

        response = scan.next();

      }

    }

 //Check if userscore is under 21

     {

        //make cpuscore equal to the result of the hit method with the parameter(&quot;CPU&quot;)

    }

    userscore = deal.userscore();

    cpuscore = deal.cpuscore();

    System.out.println(&quot;The CPU got &quot; + cpuscore);

    System.out.println(&quot;You got &quot; + userscore);

//check if lose is equal to false

//check if userscore is equal to 21. If so player got blackjack and won.

//if not then check is userscore is greater than cpuscore and wins

//if not check if cpu score is greater than userscore and loses

//All other cases tie



  scan.close();

  }

}