package sfortress.game.tile;

import sfortress.graphics.image.TileIcon;

public abstract class Tile {
  public static ArrayList<String[]> tileNames = new ArrayList<String[]>();
  
  public String name;
  public TileIcon icon;
  private TileSlot slot;
  
  public abstract void tick();
  public abstract BufferedImage draw();
  public abstract Tile fabricate();
  public void set(TileSlot slot) {
    this.slot = slot;
  }
  public String getName() {
    return getName(this);
  }
  
  public static String getName(Tile tile) {
    String name = tile.name;
    for (int i = 0; i < tileNames.size(); i++) {
      if (tileNames.get(i)[0] == tile.name) {
        name = tileNames.get(i)[1];
        break;
      }
    }
    return name;
  }
  public static boolean nameExists(String tname) {
    boolean exists = false;
    for (int i = 0; i < tileNames.size(); i++) {
      if (tileNames.get(i)[0] == tname) {
        exists = false;
        break;
      }
    }
    return exists;
  }
  public static int indexOf(String tname) {
    int k = -1;
    for (int i = 0; i < tileNames.size(); i++) {
      if (tileNames.get(i)[0] == tname) {
        k = i;
        break;
      }
    }
    return k;
  }
  public static boolean addName(Tile tile, String name) {
    if (nameExists(tile.name)) {
      tileNames.get(indexOf(tile.name))[1] = name;
    } else {
      tileNames.add(new String[] {tile.name,name});
    }
  }
}
