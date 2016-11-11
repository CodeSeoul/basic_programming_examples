package org.l2csl.java.adventuretextgame;

import org.l2csl.java.adventuretextgame.actors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<String> VALID_ACTIONS = new ArrayList<>();

    public static void main(String[] args) {
        VALID_ACTIONS.add("attack");
        VALID_ACTIONS.add("check_inventory");
        VALID_ACTIONS.add("check_health");

        Adventurer player = new Adventurer();

        Boar boar = new Boar();
        battle(player, boar);

        Dragon dragon = new Dragon();
        battle(player, dragon);

        System.out.println("You won!");
    }

    private static void battle(Adventurer player, AbstractCreature opponent) {
        System.out.println("You're battling a " + opponent.toString());

        Scanner scanner = new Scanner(System.in);

        while(player.getHealth() > 0 && opponent.getHealth() > 0) {
            String action = null;

            while(!VALID_ACTIONS.contains(action)) {
                System.out.println("What would you like to do?");
                for(String validAction : VALID_ACTIONS) {
                    System.out.println("\t" + validAction);
                }

                action = scanner.next();

                /*
                    TODO:
                    If the action is "attack", call the player's attack function
                    on the opponent.
                    If the action is "check_inventory", call the player's
                    print_inventory function.
                    If the action is "check_health", call the player's print_health
                    function
                    If the command isn't one of these, tell the user that
                    the command is invalid and that they should try again.

                    There are two ways to write this. Either will work :D
                */
            }

            if(opponent.getHealth() <= 0) {
                // TODO: The player should loot the opponent
                System.out.println("Congratuations! You slayed " + opponent.toString());
                return;
            }

            opponent.attack(player);

            if(player.getHealth() <= 0) {
                // TODO: Print to the screen that the player died
                System.exit(0);
            }
        }

        scanner.close();
    }
}

/*
    TODO: Extra goal!
    Create a new monster called a Demon.
    A Demon should have 80 health, 5 armor, and do 20 damage.
    A Demon should carry one item as loot. This item should be called
    the Heavenly Hammer of Hammertime and should provide 15 damage.
    Make sure the player fights the Demon.

    Can you adjust the player's stats such that it's possible to win
    the game but not guaranteed?
*/
