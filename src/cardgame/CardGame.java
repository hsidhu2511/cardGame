package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 * This class models a simple card guessing game
 * 
 * @author Harmandeep Kaur Sidhu
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        //Create an array to hold 7 cards
          Card[] hand = new Card[7];

        // We'll use Random to generate random numbers
        Random random = new Random();

       for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }

        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand");
      for (Card card : hand) {
            System.out.printf("%d of %s\n", card.getNumbers(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();

        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getNumbers() == userGuess.getNumbers()
                    && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }
    
        String response = match ? "Right guess": "No match";
        
        System.out.println(response);
         printinfo();
    }
    //I'm done!
    public static void printinfo(){
        System.out.println("Hello! \n");
         System.out.println("My name Harmandeep Kaur Sidhu and I am currently enrolled in Computer programming course at Sheridan College. \n");
         System.out.println("It's my second semester in this course and I think I am getting through it very well. \n");
         System.out.println("Thankyou! \n");
        System.out.println("I hope you have a good day! \n");
    }
    
   
}
