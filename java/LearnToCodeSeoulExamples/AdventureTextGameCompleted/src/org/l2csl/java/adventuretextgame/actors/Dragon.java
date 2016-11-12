package org.l2csl.java.adventuretextgame.actors;

import org.l2csl.java.adventuretextgame.props.Item;

import java.util.Arrays;

/**
 * Created by thebeege on 11/6/16.
 */
public class Dragon extends AbstractCreature {

    public Dragon() {
        super(40, 0, 20,
                Arrays.asList(
                        new Item("Sword of Dragon Slaying", 10, 0),
                        new Item("Helm of Glory", 0, 30)
                ));
    }

    @Override
    public String toString() {
        return "Dragon";
    }
}
