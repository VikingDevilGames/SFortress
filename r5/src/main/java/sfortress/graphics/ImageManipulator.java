package sfortress.graphics;

import java.awt.*;
import java.awt.image.*;

public class ImageManipulator {
  public static BufferedImage makeGlowLayer(BufferedImage image) {
    GaussianFilter filter = new GaussianFilter();
    BufferedImage image2 = new BufferedImage(image.getWidth(),image.getHeight(),BufferedImage.TYPE_INT_ARGB);
    Graphics g = image2.createGraphics();
    filter.apply(g);
    g.dispose();
    return image2;
  }
}
