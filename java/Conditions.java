/*
What are conditions?
Conditions are a method of "control flow," or intelligently making decisions
about how code should be executed. Specifically, conditions use boolean
operations to determine if a body of code should be executed. Boolean
effectively means true or false.
*/

public class Conditions {
  public static void main(String[] args) {
    boolean shouldRun = True;
    // This is the boolean data type. It only stores True or False.

    if(shouldRun) {
      System.out.println("This should run!");
    } else if(5 < 4) {
      System.out.println("Five less than four? Nonsense.");
    } else {
      System.out.println("This should never run.");
    }
    /*
    There's a lot going on here. Let's cover it step by step.

    This is an "if" condition. The logic is very simple. If the expression in
    the parentheses is true, then run the code in the squiggly brackets.
    This is immediately followed by an "else if", which is another component
    of the same "if" condition. This block states that if the previous "if"
    was false AND the following expression in parentheses is true, then run
    the code in the next block of squiggly brackets.
    The last portion is "else". If NONE of the previous "if"s within this
    block are true, run the code in the next block of squiggly brackets.

    In this specific condition, "This should run" will always be printed. This
    is because the "shouldRun" variable was already set to True; therefore,
    the first condition should always be true.
    There are other ways to get booleans. Looking at the "else if", you'll see
    a comparison operator: <. Expressions involving <, >, <=, >=, ==, or !=
    end up evaluating down to a simple true or false. These, in order, are
    less than, greater than, less than or equal to, greater than or equal to,
    equivalent, or not equivalent.
    */

    if(shouldRun && 1 == 2) {
      System.out.println("Should run... and shouldn't.");
    } else {
      System.out.println("Yeah... One does not equal two.");
    }
    /*
    What is that && thing???
    That's the "and" operator. It takes the comparisons on either side of it
    and does stuff. If both expressions on either side are true, it evaluates
    them together to true. If either is false, the whole thing is false.

    There is also the || operator, for "or." If either of the expressions on
    either side of || are true, the whole thing is true.
    */

    if(!returnFalse()) {
      System.out.println("Surprise! This prints.");
    } else {
      System.out.println("#getrekt");
    }
    /*
    returnFalse outputs a False value. The ! (bang) symbol negates the
    following value. Since returnFalse spits out False, ! will change it to
    True. The condition will then execute the first code block.
    */

    int y = 20;
    switch(y) {
      case 10: System.out.println("Got 10");
      break;
      case 20: System.out.println("Got 20");
      case 30: System.out.println("Not quite 40.");
      break;
      case 40: System.out.println("Big ol' 40");
      break;
      default: System.out.println("Wasn't 10, 20, 30, or 40.");
    }
    /*
    This is a switch-case. Switch takes in some variable. Within the curly
    braces, you have cases. Each case compares the switch value to its given
    value. If the switch value matches the case value, it executes all code
    following the case, until it hits a break. A break exits the switch. The
    act of matching one case and executing further cases is called "falling
    through." So case 20 will fall through to 30 since there is no break.
    Since case 30 has a break, it will not fall through to the 40 case.
    The default case executes when none of the previous cases are met.
    Basically, switch-case is a compound if condition with fall through.
    This will print out
      Got 20
      Not quite 40.
    */
  }

  private static boolean returnFalse() {
    return False;
  }
}
