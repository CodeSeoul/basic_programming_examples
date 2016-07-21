public class Starter {
/*
If you haven't figured it out by now, this is how you define a class. Magic.
*/

  private int startValue;
  /*
  This is a variable, or property, defined on the class. Any time you create
  an instance of Starter, it will have this startValue variable inside it.
  Notice the "private" before it. This means that no other class can access
  this value. Only Starter can read or change this variable.
  */

  public Starter(int startValue) {
  /*
  This doesn't look like any other method definition we've seen, right? It
  lacks a return type. This is a constructor method. This method is what you
  use when creating a new instance of the Starter class.
  */

    this.startValue = startValue;
    /*
    The "this" keyword references the class you're currently in. In this case,
    "this" is used to distinguish the class' startValue property and the
    given variable also called startValue. We're setting the new object's
    startValue property to the value of the startValue parameter.
    */
  }

  public int incrementValue() {
  /*
  This is a method defined on the Starter class. Any instance of Starter will
  have this incrementValue method available to it.
  */
    return this.startValue++;
    /*
    The ++ operator increases the value of the variable by 1 and sets it to
    that value.
    */
  }

  public int getValue() {
    return this.startValue;
    /*
    Why are we doing this? Generally, in Java, you want to user methods called
    "getters" and "setters." These methods retrieve and expose the value of
    variables and allow them to be changed. This is useful in case you want to
    do some work under the hood if something tries to read or change a value,
    like fire off an event or execute some other code.
    */
  }
}
