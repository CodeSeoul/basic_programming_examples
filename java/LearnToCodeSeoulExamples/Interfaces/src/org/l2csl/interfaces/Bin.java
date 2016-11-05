package org.l2csl.interfaces;

/**
 * Created by draco on 10/29/2016.
 */
public class Bin implements Storable {
    public void store(Object obj) {
        System.out.println("Stored " + obj.toString());
    }
}
