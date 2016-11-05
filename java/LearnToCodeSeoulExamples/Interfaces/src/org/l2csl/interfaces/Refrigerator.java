package org.l2csl.interfaces;

/**
 * Created by draco on 10/29/2016.
 */
public class Refrigerator implements Storable {
    public void store(Object obj) {
        System.out.println("Making " + obj + " cold");
    }

    public void freeze(Object obj) {
        System.out.println("Freezing " + obj);
    }
}
