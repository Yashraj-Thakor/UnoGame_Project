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
public class NumberCard extends UnoCard {

    private int number;

    public NumberCard(Color color, int number) {
        super(color);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return getColor() + " " + number;
    }
}