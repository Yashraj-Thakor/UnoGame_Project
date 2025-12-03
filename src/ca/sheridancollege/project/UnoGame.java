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

public class UnoGame extends Game {

    private Deck deck;
    private ArrayList<UnoCard> discardPile = new ArrayList<>();

    public UnoGame(String name, ArrayList<Player> players) {
        super(name);
        this.deck = new Deck();
        this.setPlayers(players);
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<UnoCard> getDiscardPile() {
        return discardPile;
    }

    @Override
    public void play() {
        // Implement during Deliverable 3
    }

    @Override
    public void declareWinner() {
        // Implement during Deliverable 3
    }
}
