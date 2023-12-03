/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab5;

import java.util.ArrayList;

/**
 * A pile of cards.
 *
 */
public class CardPile {

    //Instance variables
    private ArrayList<Card> cards;

    public CardPile() {
        //Initialize the instance variable.
        cards = new ArrayList<Card>();
    }

    /**
     * Add a card to the pile.
     *
     * @param card
     */
    public void add(Card card) {
        cards.add(card);

    }

    /**
     * Remove a card chosen at random from the pile.
     *
     * @return
     */
    public Card removeRandom() {
        // Declares rand integer, then multiplies the deck size by a random double from 0 - 1. This number is then converted into an integer.
        int rand = (int) (Math.random() * cards.size());
        // The card that is going to be removed is saved into the variable "deleted", and is removed from the deck.
        Card deleted = cards.get(rand);
        // The remove method removes the specified card, and shifts any subsequent elements to the left by 1.
        cards.remove(rand);
        // The removed card is displayed.
        return deleted;
    }

    /**
     * The string representation is a space separated list of each card.
     *
     * @return
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cards.size(); i++) {
            s += "" + cards.get(i) + " ";
        }

        return s;
    }

    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for (int i = 2; i < 15; i++) {
            for (int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i + 1) + ": " + deck.removeRandom());

        }
    }

}
