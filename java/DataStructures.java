import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
/*
These are imports. Import statements pull in objects from the Java standard
library. The standard library provides a multitude of objects that make
life easier for you. Who wants to always start from scratch?

In this case, we're pulling in a few different types of data structures.
We'll go over them in detail below.
*/

public class DataStructures {
  public static void main(String[] args) {
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    /*
    What's with the tag brackets? ArrayList is a type of generic. Generics
    accept another object type as part of their declaration. This ensures that
    you always know what type of object you're putting in and getting out.
    In this case, we're using the Integer class. Integer is a wrapper for the
    primitive "int." Generics can't hold primitives, so we can resort to
    Integer for ease.
    */

    for(Integer i = 0; i < 10; i++) {
      arrlist.add(i);
    }
    /*
    Notice that we're using Integer instead of int.
    What are we doing here? An ArrayList is a super fancy type of array. An
    array is a simple construct - it's just a way to store multiple values
    of the same type in one variable. This is called a data structure. An
    array is just one type of data structure.
    */

    System.out.println("arrlist: " + arrlist.toString());
    /*
    You'll notice the contents of the ArrayList printed out. An array stores
    values in a specific order at specific locations. You can access these
    locations by their position. See below
    */

    System.out.println("arrlist 0th element: " + arrlist.get(0).toString());
    /*
    In Java, when counting members of collections, everything starts from 0.
    It's just a thing you kinda gotta know. In this case, we're printing
    the first element, or zeroth element, to the screen.
    */

    /*
    So we've mentioned arrays and ArrayList multiple times but separately.
    Java supports standard arrays as well.
    */
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("arr 2nd element: " + Integer.toString(arr[2]));
    /*
    What's the difference between an array and ArrayList? Well, arrays are
    of a fixed size. That is, once you create an array, you can't enlarge or
    shrink its capacity. ArrayLists are more malleable, though they just
    use arrays under the hood. They simply create new arrays when resizes
    occur. ArrayLists also provide lots of helper functions to make life
    easier. You can look these up in the Java standard library.
    When would you use one versus the other? Well, generally, ArrayLists will
    do what you need. There is a slightly greater overhead to using an
    ArrayList instead of an array, but it's usually not anything to worry
    about.
    See ArrayList documentation at
    https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
    See general info about arrays at
    https://en.wikipedia.org/wiki/Array_data_type
    */

    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    /*
    Maps are another type of data structure. Where an array is simply a
    list of values in order, a map stores a collection of values by key. This
    is often called key-value pairing. You can lookup a value by its key.
    */

    hmap.put("One", 1);
    hmap.put("Two", 2);
    hmap.put("Three", 3);
    hmap.put("Four", 4);

    System.out.println("hmap: " + hmap.toString());
    /*
    You'll notice that the printed information is out of order. Maps make no
    guarantee around the order of keys and values.
    */

    System.out.println("hmap One: " + Integer.toString(hmap.get("One")));
    /*
    This is an example of how to retrieve a value from a map. Maps provide
    a get method, which you feed the key. Give the key, the get value.
    Easy mode.

    You may have noticed that I keep mentioning maps, but this is a HashMap.
    A HashMap is a specific implementation of a map. HashMaps use a hash
    of the key to lookup values. This is simply for speed. In the event two
    keys end up resulting to the same hash, there's more stuff under the hood
    to make sure you get the right value out. This is worth knowing but a
    little too lengthy to explain here. I recommend reading up on HashMap
    implementations.
    See Java's HashMap docs at
    https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
    For maps (or associative arrays), see
    https://en.wikipedia.org/wiki/Associative_array
    For hash tables (hash maps), see
    https://en.wikipedia.org/wiki/Hash_table
    */

    LinkedList<Integer> llist = new LinkedList<Integer>();
    /*
    A linked list is another way to store collections. Linked lists generally
    only store the first and maybe last elements in the collection. To access
    any values in between, you need to interate through the list to get the
    item you want. While arrays are great for quick reading, linked lists
    are better for fast writing. Java linked lists provide all sorts of
    helper functions to make them behave like arrays, but their performance
    will differ drastically, depending on the operations.
    We won't cover how linked lists work in detail here, but it's definitely
    worth looking up in detail.
    See Java's LinkedList docs at
    https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
    For general linked list info, see
    https://en.wikipedia.org/wiki/Linked_list
    */
  }
}
