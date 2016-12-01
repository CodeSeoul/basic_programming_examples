/**
 * Created by draco on 11/5/2016.
 */
public class Pen extends AbstractWritingTool {

    @Override
    public void write(String text) {
        material = "ink";
        super.write(text);
    }
}
