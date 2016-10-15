class Conditions {
  public static void main(String[] args) {
    int x = -100;

    if(x > 4) {
      System.out.println("X is greater than 4");
    } else if(x == 4) {
      System.out.println("X is not greater than 4. X is equivalent to 4.");
    } else if(x < 4) {
      System.out.println("X is less than 4.");
    } else if(x == -100) {
      System.out.println("X is -100.");
    } else {
      System.out.println("X can't exist");
    }

    if(x >= -100) {
      System.out.println("X is greater than or equal to -100.");
    }

    switch(x) {
      case -101:
      System.out.println("Case X is -101");

      case 10:
      System.out.println("Case X is 10");

      case 20:
      System.out.println("Case X is 20");

      default:
      System.out.println("X is not -101, 10, or 20");
      break;
    }

    String text = "hello";
    boolean isTrue = true;

    if(text == "hello") {
      System.out.println("text is hello");
    }
    if(text.equals("hello")) {
      System.out.println("text is greater than hello");
    }

    if(true) {
      System.out.println("This will always run.");
    }
    if(false) {
      System.out.println("This will never run.");
    }
    if(!true) {
      System.out.println("This will never run.");
    } else {
      System.out.println("This will always run; otherwise, !true is true");
    }

    if(x + 10 * 120000 / 5 > 0) {
      System.out.println("X and crazy math is greater than zero.");
    }
  }
}
