/**
 * Created by draco on 11/5/2016.
 */
public abstract class AbstractWritingTool {
    public static int subtract(int a, int b) {
        return a - b;
    }

    public String material;
    public int thickness;

    public void write(String text) {
        writeOntoPaper(material, thickness);
    }
}
