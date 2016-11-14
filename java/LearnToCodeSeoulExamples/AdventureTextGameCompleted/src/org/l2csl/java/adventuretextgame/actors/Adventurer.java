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
        for(Item item : deadCreature.inventory) {
            System.out.println("You looted " + item.toString() + " from " + deadCreature.toString() + "!");
            inventory.add(item);
        }
        updateStats();
    }

    private void updateStats() {
        armor = BASE_ARMOR;
        damage = BASE_DAMAGE;
        for(Item item : inventory) {
            armor += item.getArmor();
            damage += item.getDamage();
        }
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
        return "Noble Adventurer";
    }
}
