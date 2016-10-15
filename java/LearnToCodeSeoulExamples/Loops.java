class Loops {
  public static void main(String[] args) {
    /*while(true) {
      System.out.println("I SPEAK THE TRUTH");
    }*/
    int x = 0;
    while(x < 5) {
      System.out.println("X is " + x);
      x++; // == x += 1 == x = x + 1
    }

    // DON'T DO THIS
    // I was just making a point :3
    String text = "";
    while(!text.equals("oooo")) {
      System.out.println("text is " + text);
      text += "o";
    }

    for(int y = 0; y < 10; y++) {
      System.out.println("For y is " + y);
    }

    for(int i = 10; i > 0; i--) {
      System.out.println("For i is " + i);
    }
  }
}
