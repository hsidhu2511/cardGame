/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Harmandeep Kaur Sidhu
 */
public class Card 
{
    private int numbers; 
    private String suit;
    
    public static final String[] SUITS = {"diamonds","spades","clubs","hearts"};
    public int getNumbers() {
        return numbers;
    }

   
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

   
    public String getSuit() {
        return suit;
    }

    
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Card(int numbers, String suit) {
        this.numbers = numbers;
        this.suit = suit;
    }
   
    
}
