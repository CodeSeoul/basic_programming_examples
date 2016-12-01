/**
 * Created by draco on 11/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Helper.maxSpeed = 100;
        System.out.println("maxSpeed:" + Helper.maxSpeed);

        int sum = Helper.add(2, 3);
        System.out.println("sum: " + sum);

        Helper helperObject = new Helper();
        int speed = helperObject.currentSpeed;

        AbstractWritingTool broken = new AbstractWritingTool();
        AbstractWritingTool myObj = new Pen();
        AbstractWritingTool pencil = new Pencil();
        myObj.write("text to write");


    }
}
