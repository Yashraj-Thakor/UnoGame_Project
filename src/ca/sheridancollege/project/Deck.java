//Yashraj
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Deck extends GroupOfCards {
    
    public Deck() {
        super(108); 
        setCards(new ArrayList<>());
        generateDeck();
    }

    private void generateDeck() {
        // Number Cards (0–9) in 4 colors
        for (UnoCard.Color color : UnoCard.Color.values()) {
            if (color == UnoCard.Color.WILD) continue;

            for (int i = 0; i <= 9; i++) {
                getCards().add(new NumberCard(color, i));
            }
        }

        // Action Cards
        for (UnoCard.Color color : UnoCard.Color.values()) {
            if (color == UnoCard.Color.WILD) continue;

            getCards().add(new ActionCard(color, ActionCard.ActionType.SKIP));
            getCards().add(new ActionCard(color, ActionCard.ActionType.REVERSE));
            getCards().add(new ActionCard(color, ActionCard.ActionType.DRAW_TWO));
        }

        // Wild cards
        for (int i = 0; i < 4; i++) {
            getCards().add(new ActionCard(UnoCard.Color.WILD, ActionCard.ActionType.WILD));
            getCards().add(new ActionCard(UnoCard.Color.WILD, ActionCard.ActionType.WILD_DRAW_FOUR));
        }
    }
}