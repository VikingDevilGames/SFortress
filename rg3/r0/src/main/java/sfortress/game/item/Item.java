package sfrotress.game.item;

import sfortress.graphics.image.ItemIcon;

public abstract class Item {
  public String id;
  public String name;
  public ItemIcon icon;
  
  public static void drawInWorld(int side) {
    return icon.draw(true,side);
  }
  public static void draw() {
    return icon.draw(false);
  }
}
