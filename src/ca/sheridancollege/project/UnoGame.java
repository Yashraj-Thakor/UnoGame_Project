/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class UnoGame extends Game {
    private Deck deck;
    private ArrayList<UnoCard> discardPile = new ArrayList<>();

    public UnoGame(String name, ArrayList<Player> players) {
        super(name);
        this.setPlayers(players);

        deck = new Deck();
    }

    @Override
    public void play() {
        System.out.println("UNO GAME STARTED!");
        deck.shuffle();

        // Deal 7 cards to each player
        for (Player p : getPlayers()) {
            UnoPlayer up = (UnoPlayer) p;
            for (int i = 0; i < 7; i++) {
                up.getHand().getCards().add((UnoCard) deck.getCards().remove(0));
            }
        }

       
        UnoCard topCard = (UnoCard) deck.getCards().remove(0);
        discardPile.add(topCard);
        System.out.println("Starting card: " + topCard);

        boolean gameOver = false;

        while (!gameOver) {
            for (Player p : getPlayers()) {
                UnoPlayer up = (UnoPlayer) p;
                System.out.println("\n" + up.getName() + "'s turn. Top card: " + topCard);

                UnoCard played = up.playCard(topCard);

                if (played != null) {
                    discardPile.add(played);
                    topCard = played;
                    System.out.println(up.getName() + " played: " + played);

               
                    if (up.getHand().getCards().isEmpty()) {
                        declareWinner(up);
                        gameOver = true;
                        break;
                    }

                } else {
                  
                    System.out.println(up.getName() + " had no match. Drew a card.");
                    up.drawCard(deck);
                }

               
                if (deck.getCards().isEmpty()) {
                    System.out.println("Deck empty! No winner found.");
                    gameOver = true;
                    break;
                }

             
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("Game Over! No winner this time.");
    }

    public void declareWinner(Player winner) {
        System.out.println("\n------------------------------------------");
        System.out.println("Congratulations, " + winner.getName() + " wins the UNO game!");
        System.out.println("------------------------------------------\n");
    }
}
