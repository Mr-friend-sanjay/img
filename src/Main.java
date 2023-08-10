import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedImage image1 = ImageIO.read(new File("C:\\Users\\sanja\\OneDrive\\Desktop\\img-comp1\\src\\image-1.jpg"));
            BufferedImage image2 = ImageIO.read(new File("C:\\Users\\sanja\\OneDrive\\Desktop\\img-comp1\\src\\image-2.jpg"));

            int width = image1.getWidth();
            int height = image1.getHeight();
            double totalPixels = width * height;
            double differentPixels = 0;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel1 = image1.getRGB(x, y);
                    int pixel2 = image2.getRGB(x, y);
                    if (pixel1 != pixel2) {
                        differentPixels++;
                    }
                }
            }

            double percentageDifference = (differentPixels / totalPixels) * 100;

            System.out.println("Percentage Difference: " + percentageDifference + "%");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
