package org.l2csl.java.adventuretextgame.actors;

import org.l2csl.java.adventuretextgame.props.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thebeege on 11/6/16.
 */
public class AbstractCreature {
    int health, armor, damage;

    List<Item> inventory;

    public AbstractCreature(int health, int armor, int damage, List<Item> inventory) {
        this.health = health;
        this.armor = armor;
        this.damage = damage;
        this.inventory = inventory;
    }

    public AbstractCreature(int health, int armor, int damage) {
        this(health, armor, damage, new ArrayList<>());
    }

    public void attack(AbstractCreature target) {
        System.out.println(this.toString() + " is attacking " + target.toString());
        target.takeDamage(damage);
    }

    public void takeDamage(int damageAmount) {
        int calculatedDamage = damageAmount - armor;
        System.out.println(this.toString() + " lost " + calculatedDamage + " health points in damage");
        health -= calculatedDamage;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getHealth() {
        return health;
    }
}
