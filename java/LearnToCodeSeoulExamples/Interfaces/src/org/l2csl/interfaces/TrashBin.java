package org.l2csl.interfaces;

/**
 * Created by draco on 10/29/2016.
 */
public class TrashBin extends Bin {

    @Override
    public void store(Object obj) {
        super.store(obj);
        System.out.println("Trashing " + obj.toString());
    }

    public void trash(Object obj) {
        System.out.println(obj.toString() + " is gone!");
    }
}
