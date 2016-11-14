package org.l2csl.java.adventuretextgame.actors;

import org.l2csl.java.adventuretextgame.props.Item;

import java.util.Arrays;

/**
 * Created by thebeege on 11/6/16.
 */
public class Boar extends AbstractCreature {
    public Boar() {
        super(30, 0, 6,
                Arrays.asList(
                        new Item("Shield of the Wild", 0, 10)
                ));
    }

    @Override
    public String toString() {
        return "Boar";
    }
}
