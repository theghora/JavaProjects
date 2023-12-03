/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab5;

/**
 *
 * @author Taha Ghori
 */
public class Card implements Comparable {
  //Symbolic constants
public int rank;
public int suit;
public boolean faceUp;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
    this.rank = rank;
    this.suit = suit;
    this.faceUp = faceUp;
    
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return this.faceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    this.faceUp = faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    if (this.rank == 14)
        return 1;
    return this.rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return this.suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    // if the suit and rank are equal, it would return the boolean value true, else, it would return false.
    Card c = (Card) ob;
    if (this.getSuit() == c.getSuit() && this.getRank() == c.getRank())
        return true; //FIX THIS
    else
        return false;
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
      // If this rank is smaller than the specified card's rank, it would return -1. If it was greater, it would return 1.
      //But if it equal, it would compare the suits. If the suit is "smaller" than the specified card's suit, it would return -1. Etc.
      // If the suit and rank are the same, it would return 0.
    if (this.getRank() < c.getRank())
        return -1;
    else if (this.getRank() > c.getRank())
        return 1;
    else
        if (this.getSuit() < c.getSuit())
            return -1;
        else if (this.getSuit() > c.getSuit())
            return 1;
        else
            return 0;
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      if (getRank() > 1 && getRank() < 11)
          return "" + getRank();
      else if (getRank() == 11)
          return "Jack";
      else if (getRank() == 12)
          return "Queen";
      else if (getRank() == 13)
          return "King";
      else if (getRank() == 14 || getRank() == 1)
          return "A";
      else
          return "Error";
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
    switch (getSuit()) {
        case 0:
            return "Club";
        case 1:
            return "Diamond";
        case 2:
            return "Heart";
        case 3:
            return "Spade";
        default:
            return "Error";
    }
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
        if (isFaceUp())
            return "" + getRankString() + " of " + getSuitString();
        else
            return "?";
  }
 
  
  
  

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, 3, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}

