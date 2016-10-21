import java.util.ArrayList;
import java.util.HashMap;

class DataStructures {
  public static void main(String[] args) {
    int[] basicArray = {1, 2, 3, 4};
    System.out.println("basicArray: " + basicArray.toString());

    // for(int i = 0; i < basicArray.length; i++) {...}
    for(int i : basicArray) {
      System.out.println("i = " + i);
    }

    for(int i = 0; i < basicArray.length; i++) {
      System.out.println("traditional i = " + i);
    }

    // int is primitive
    // Integer is a full-fledged object - lots of properties and methods
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    for(int i = 0; i < 20; i++) {
      arrList.add(i);
    }
    System.out.println("arrList: " + arrList.toString());

    if(arrList.contains(new Integer(5))) {
      System.out.println("5 is in the arrayList");
    }

    arrList.remove(0); // removes the first (index 0) value
    System.out.println("ArrayList without first element: " + arrList.toString());

    arrList.remove(new Integer(5)); // Removes the object 5
    System.out.println("ArrayList without the number 5: " + arrList.toString());

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("Meetup");
    stringList.add("is");
    stringList.add("cool");
    stringList.add("yay");
    System.out.println("stringList: " + stringList.toString());
    stringList.remove("cool");
    System.out.println("stringList after removing cool: " + stringList.toString());

    stringList.add(3, "!");
    System.out.println("stringList after adding ! at location 3: " + stringList.toString());

    // Pulling things out of ArrayList and array
    System.out.println("2nd element: " + stringList.get(1));
    System.out.println("2nd element of basic array: " + basicArray[1]);

    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("First Key", new Integer(10));
    map.put("Second Key", new Integer(9001));
    System.out.println("map: " + map.toString());

    System.out.println("what's stored at First Key? " + map.get("First Key"));

    map.remove("Second Key");
    System.out.println("removed second key: " + map.toString());

    map.put("First Key", new Integer(11));
    System.out.println("Replaced First Key's value with 11: " + map.toString());

    if(map.containsKey("First Key")) {
      System.out.println("Map contains a key called First Name");
    }
    if(map.containsKey("Second Key")) {
      System.out.println("Map contains a key called Second Key");
    }

    System.out.println("Values of map: " + map.values().toString());
    System.out.println("Keys of map: " + map.keySet().toString());

    for(String key : map.keySet()) {
      System.out.println("Key: " + key);
      System.out.println("Value at key '" + key + "': " + map.get(key));
    }
  }
}
