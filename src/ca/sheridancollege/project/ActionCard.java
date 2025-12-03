//yashraj
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author HP
 */
public class ActionCard extends UnoCard {

    public enum ActionType {
        SKIP, REVERSE, DRAW_TWO, WILD, WILD_DRAW_FOUR
    }

    private ActionType action;

    public ActionCard(Color color, ActionType action) {
        super(color);
        this.action = action;
    }

    public ActionType getAction() {
        return action;
    }

    @Override
    public String toString() {
        return getColor() + " " + action;
    }
}
