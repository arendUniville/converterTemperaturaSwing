import javax.swing.*;
import java.awt.*;

public class ImagemUtil {

    public static ImageIcon getImage(String fileName, int width, int weight){
        Image image = new ImageIcon(fileName).getImage().getScaledInstance(width,weight, Image.SCALE_DEFAULT);
        return new ImageIcon(image);
    }

}
