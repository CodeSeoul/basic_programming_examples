/**
 * Created by thebeege on 11/4/16.
 */
public abstract class Helper {
/*
    Abstract? What's that?
        It means we can't create an object instance of the Helper class. Why would we want to do this?
        There's two situations, usually:
            1) You need a reference class to hold a bunch of your static properties. We'll cover this in a moment.
            2) You want to lay some groundwork for properties and/or methods in child classes, but you
                don't want the "base" version to be usable.
 */

    public static final int HIGH = 10;
    public static final int MEDIUM = 5;
    public static final int LOW = 0;
    /*
        Static? Final?
            Static means that we access the property or method on the class. We DON'T need an object instance
            of the class in order to access this. This is useful for reference information or operations that
            don't require object-specific data.
            Final has several meanings:
            For variables:
                It means that the value cannot be reassigned once assigned. This is effectively how we create "constant"
            values. Be aware, this has to do with assignment. If we have an array, for example, we can change the
            values within the array, but we can't set the variable equal to a new array.
                You can also define final variables with no value. These are called "blank finals". You must assign
                these variables within every constructor. They cannot be reassigned after that.
            For classes:
                It means the class can't be extended.
            For methods:
                It means the method can't be overriden by a child class.
     */

    int[] nums; // This is technically useless as it is here... You'll see later

    public static int calcIntAverage(int... nums) {
    /*
        Similar to a static variable, a static method does not need an object instance to be called.
        The "int... nums" parameter allows you to provide an arbitrary number of parameters. The nums parameter
        will be an array consisting of those given parameters.
     */
        int total = 0;
        for(int num : nums) {
            total += num;
        }
        return total / nums.length;
    }
}
