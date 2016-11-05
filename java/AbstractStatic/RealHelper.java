/**
 * Created by thebeege on 11/4/16.
 */
public class RealHelper extends Helper {
/*
    Inheritance with abstract classes works the same as normal classes.
 */

    public RealHelper(int... nums) {
        this.nums = nums;
        /*
            But where was this.nums defined? RealHelper extends Helper, right? Help has a nums property defined.
            Therefore, RealHelper inherits the nums property from Helper.
         */
    }

    public int calcIntAverage() {
        return Helper.calcIntAverage(this.nums);
        /*
            This is just an example of using the statically defined calcIntAverage function.
            Notice it has the same name. We're technically overloading, here.
         */
    }
}
