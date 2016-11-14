package org.l2csl.java.adventuretextgame.props;

/**
 * Created by thebeege on 11/6/16.
 */
public class Item {
    private String name;
    private int damage, armor;

    public Item(String name, int damage, int armor) {
        this.name = name;
        this.damage = damage;
        this.armor = armor;
    }

    /*
      TODO:
      Define getters for armor and damage, called getArmor() and getDamage()
    */

    @Override
    public String toString() {
        return name + " (Damage: " + damage  + ", " + "Armor: " + armor + ")";
    }
}
