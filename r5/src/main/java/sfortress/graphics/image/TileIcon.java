package sfortress.graphics.image;

import java.awt.image.*;

public class TileIcon extends BufferedImage {
  public float glow;
  
  public BufferedImage[] draw() {;
    BufferedImage glow = new BufferedImage();
    Graphics graphics = glow.createGraphics();
    graphics.drawImage(ImageManipultor.makeGlowLayer(this),0,0,null);
  }
  public TileIcon(String name) {
    setImage(SFortress.path(".data.sprites.")+name+".png");
  }
  public void setImage(String path) {
    BufferedImage image = ImageIO.read(new File(path));
    Graphics g = this.createGraphics();
    g.drawImage(image,0,0,null);
  }
}
