package org.l2csl.interfaces;

import java.util.ArrayList;
import java.util.IllegalFormatConversionException;
import java.util.IllformedLocaleException;

/**
 * Created by draco on 10/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Storable> arr = new ArrayList();

        Storable doesntmatter = new Refrigerator();
        doesntmatter.store(new Object());

        Bin trash = new TrashBin();
        trash.store(new Object());

        arr.add(doesntmatter);
        arr.add(trash);
        arr.add(new Bin());
        arr.add(new Refrigerator());

        String ricky = "Ricky";
        for(Storable chair : arr) {
            chair.store(ricky);
        }

        try(DBConnection...)  {
            arr.get(5);
        } catch(IndexOutOfBoundsException e) {
            System.err.println("Mistakes were made!");
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace(System.err);
        } catch(IllegalFormatConversionException|IllformedLocaleException e) {
            System.out.println("Ill exception");
        } catch (Exception e) {
            System.err.println("ILLEGAL ACCESS RAWR");
        } finally {
            System.out.println("This prints no matter what");
        }
    }
}
