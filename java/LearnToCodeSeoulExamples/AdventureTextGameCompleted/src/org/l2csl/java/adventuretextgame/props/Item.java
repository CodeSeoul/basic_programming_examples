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

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return name + " (Damage: " + damage  + ", " + "Armor: " + armor + ")";
    }
}
