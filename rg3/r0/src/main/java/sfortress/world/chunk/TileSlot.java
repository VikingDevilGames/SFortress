package sfortress.world.chunk;

import java.awt.image.BufferedImage;
import sfortress.game.tile.*;

public class TileSlot {
  private Tile tile;
  private boolean emtpy;
  private float temp;
  private final Position loc;
  
  public TileSlot() {
    setTile(null);
  }
  public TileSlot(Position loc) {
    this(null,loc);
  }
  public TileSlot(Tile tile,Position loc) {
    setTile(tile);
    this.loc = loc;
  }
  
  public void setTile(Tile tile) {
    this.emtpy = (tile != null);
    this.tile = (!this.empty)?tile:new VoidTile();
  }
  public void destroyTile() {
    tile.destroy();
    if (!empty) {
      removeTile();
    }
  }
  public Tile getTile() {
    return Tile;
  }
  public void removeTile() {
    setTile(null);
  }
  public float getTemp() {
    return temp;
  }
  public void setPosition(Position p) {
    this.loc = p;
  }
}
