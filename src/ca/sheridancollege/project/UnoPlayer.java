/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class UnoPlayer extends Player {

    private Hand hand;

    // Constructor
    public UnoPlayer(String name) {
        super(name);
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    /**
     * This method lets the player try to play a card.
     * It checks if any card in hand matches the top card in color, number, or type.
     */
    public UnoCard playCard(UnoCard topCard) {
        ArrayList<Card> cards = hand.getCards();

        for (int i = 0; i < cards.size(); i++) {
            UnoCard current = (UnoCard) cards.get(i);

            
            if (current.getColor() == topCard.getColor()
                    || current instanceof ActionCard
                    || current instanceof NumberCard && topCard instanceof NumberCard
                    && ((NumberCard) current).getNumber() == ((NumberCard) topCard).getNumber()
                    || current.getColor() == UnoCard.Color.WILD) {

                cards.remove(i);
                return current;
            }
        }
        return null; // no playable card
    }

    /**
     * Draws one card from the deck if no valid card is available.
     */
    public void drawCard(Deck deck) {
        if (!deck.getCards().isEmpty()) {
            UnoCard drawn = (UnoCard) deck.getCards().remove(0);
            hand.getCards().add(drawn);
        }
    }

    /**
     * Method to play one full turn (used for potential automation)
     */
    @Override
    public void play() {
       
    }

    @Override
    public String toString() {
        return getName() + "'s hand: " + hand;
    }
}


