package sfortress.game.tile;

import sfortress.graphics.image.TileIcon;

public abstract class Tile {
  public static ArrayList<String[]> tileNames = new ArrayList<String[]>();
  
  public String name;
  public TileIcon icon;
  
  public abstract void tick();
  public BufferedImage draw();
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
    for (int i = 0; i < tileNames.size(); i++) {
      // UNFINISHED
    }
  }
  public static boolean addName(Tile tile, String name) {
    if (nameExists(tile.name)) {
      tileNames.get(indexOf(tile.name))[1] = name;
    } else {
      tileNames.add(new String[] {tile.name,name});
    }
  }
}
