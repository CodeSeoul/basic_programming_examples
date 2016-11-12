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

                switch(action) {
                    case "attack":
                        player.attack(opponent);
                        break;
                    case "check_inventory":
                        player.printInventory();
                        break;
                    case "check_health":
                        player.printHealth();
                        break;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            }

            if(opponent.getHealth() <= 0) {
                player.loot(opponent);
                System.out.println("Congratuations! You slayed " + opponent.toString());
                return;
            }

            opponent.attack(player);

            if(player.getHealth() <= 0) {
                System.out.println("Aww, you died :(");
                System.exit(0);
            }
        }

        scanner.close();
    }
}
