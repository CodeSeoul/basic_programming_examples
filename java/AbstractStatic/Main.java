/**
 * Created by thebeege on 11/4/16.
 */
public class Main {
    public static void main(String[] args) {
        int myVal = Helper.HIGH;
        /*
            This is an example of using a statically defined property. We never created an instance of
            the Helper class, but we can still use the HIGH value defined on it.
         */
        System.out.println("myVal: " + Integer.toString(myVal));

        int avgVal = Helper.calcIntAverage(Helper.HIGH, Helper.MEDIUM, Helper.LOW, 7);
        /*
            The same is true of static methods. No Helper object instance required.
         */
        System.out.println("static calcIntAverage: " + Integer.toString(avgVal));

        // Helper help = new Helper(10, 50, 20); -- This doesn't work. Helper is abstract

        /*
            RealHelper is not abstract, so we can treat it as normal.
         */
        RealHelper help = new RealHelper(10, 50, 20);
        avgVal = help.calcIntAverage();
        System.out.println("help.calcIntAverage: " + Integer.toString(avgVal));
    }
}
