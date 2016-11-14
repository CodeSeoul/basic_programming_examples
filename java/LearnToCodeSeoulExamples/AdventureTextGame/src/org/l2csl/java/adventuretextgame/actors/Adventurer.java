package org.l2csl.java.adventuretextgame.actors;

import org.l2csl.java.adventuretextgame.props.Item;

import java.util.ArrayList;

/**
 * Created by thebeege on 11/6/16.
 */
public class Adventurer extends AbstractCreature {

    private static final int BASE_HEALTH = 30, BASE_ARMOR = 5, BASE_DAMAGE = 10;


    public Adventurer() {
        super(BASE_HEALTH, BASE_ARMOR, BASE_DAMAGE);
    }

    public void loot(AbstractCreature deadCreature) {
        /*
            TODO: For each item in the dead creature's loot, we should
            print that the player looted the item and add it to
            the inventory
        */
        updateStats();
    }

    private void updateStats() {
        /*
            TODO: We should set its armor and damage back to the base values,
            then for each item in the Adventurer's inventory, we should add
            the armor and damage to the Adventurer's armor and damage
        */
    }

    public void printInventory() {
        System.out.println("The Noble Adventurer is currently carrying:");
        if(inventory.size() == 0) {
            System.out.println("\tNothing");
        } else {
            for(Item item : inventory) {
                System.out.println("\t" + item.toString());
            }
        }
    }

    public void printHealth() {
        System.out.println("The Noble Adventurer's current health: " + health);
    }

    @Override
    public String toString() {
      /*
          TODO: When we try to print an Adventurer object, we should
          see the text "Noble Adventurer"
      */
    }
}
