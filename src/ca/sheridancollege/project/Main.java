/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new UnoPlayer("Yashraj"));
        players.add(new UnoPlayer("Sahil"));
        players.add(new UnoPlayer("Udham"));

        UnoGame game = new UnoGame("UNO Showdown", players);
        game.play();
    }
}
