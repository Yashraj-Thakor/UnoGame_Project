/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

public class UnoPlayer extends Player {

    private Hand hand;

    public UnoPlayer(String name) {
        super(name);
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {
        // Placeholder: handled by UnoGame
    }

    public UnoCard playCard(UnoCard topCard) {
        for (Card c : hand.getCards()) {
            UnoCard card = (UnoCard) c;

            if (card instanceof NumberCard) {
                NumberCard n = (NumberCard) card;
                if (n.getColor() == topCard.getColor()
                        || (topCard instanceof NumberCard
                        && n.getNumber() == ((NumberCard) topCard).getNumber())) {
                    hand.getCards().remove(card);
                    return card;
                }
            } else if (card instanceof ActionCard) {
                ActionCard a = (ActionCard) card;
                if (a.getColor() == topCard.getColor()
                        || a.getAction() == ActionCard.ActionType.WILD
                        || a.getAction() == ActionCard.ActionType.WILD_DRAW_FOUR) {
                    hand.getCards().remove(card);
                    return card;
                }
            }
        }
        return null;
    }
}

