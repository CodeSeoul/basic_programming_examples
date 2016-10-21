import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Calculator {
  public static void main(String[] args) {
    List<String> validOperators = Arrays.asList("+", "-", "/", "*");

    Scanner scan = new Scanner(System.in);

    System.out.print("Give me the first number: ");
    float firstNumber = scan.nextFloat();
    System.out.println("You entered: " + firstNumber);

    String operator = "";
    while(!validOperators.contains(operator)) {
      System.out.print("Give me an operator: ");
      operator = scan.next();
      System.out.println("You entered: '" + operator + "'");
    }

    System.out.print("Give me the second number: ");
    float secondNumber = scan.nextFloat();
    System.out.println("You entered: " + secondNumber);

    if(operator.equals("+")) {
      System.out.println("Total = " + (firstNumber + secondNumber));
    }

    scan.close();
  }
}
