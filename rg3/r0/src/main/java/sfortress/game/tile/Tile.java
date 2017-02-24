package sfortress.game.tile;

import sfortress.graphics.image.TileIcon;

public abstract class Tile {
  public String id;
  public String name;
  public TileIcon icon;
  
  private TileSlot slot;
  
  public abstract Tile fabricate();
  public abstract void tick();
  
  public void set(TileSlot slot) {
    this.slot = slot;
  }
  public BufferedImage[] draw(int side) {
    return icon.draw(side);
  }
}
