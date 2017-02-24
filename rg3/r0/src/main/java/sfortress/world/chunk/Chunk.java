package sfortress.world.chunk;

import sfortress.world.chunk.*;

import static sfortress.game.Game.spriteScale;
import static sfortress.game.Game.viewerPos;

public class Chunk {
  public TileSlot[][][] slots;
  public int scale;
  public Position loc;
  
  public Chunk(int scale) {
    this.scale = scale;
    slots = new TileSlot[scale][scale][scale];
    for (int x = 0; x < slots.length; x++) {
      for (int y = 0; y < slots[x].length; y++) {
        for (int z = 0; z < slots[x][y].length; z++) {
          slots[x][y][z] = new TileSlot(new Position(x,y,z));
        }
      }
    }
  }
  
  
  public BufferedImage draw(Side side) {
    int iScale = spriteScale * scale;
    BufferedImage image = new BufferedImage(iScale,iScale,BufferedImage.TYPE_INT_ARGB);
    Graphics g = image.createGraphics():
    
    if (side == Side.TOP) {
      for (int x = 0; x < slots.length; x++) {
        for (int y = 0; y < slots[x].length; y++) {
          for (int z = 0; z < slots[x][y].length; z++) {
            g.drawImage(ImageManipulator.handleTile(slots[x][y][z].draw(side)),0,0,null);
          }
        }
      }
    } else if (side == Side.NORTH) {
      for (int x = 0; x < slots.length; x++) {
        for (int y = 0; y < slots[x].length; y++) {
          for (int z = 0; z < slots[x][y].length; z++) {
            g.drawImage(ImageManipulator.handleTile(slots[x][z][y].draw(side)),0,0,null);
          }
        }
      }
    } else if (side == Side.SOUTH) {
      for (int x = 0; x < slots.length; x++) {
        for (int y = 0; y < slots[x].length; y++) {
          for (int z = 0; z < slots[x][y].length; z++) {
            g.drawImage(ImageManipulator.handleTile(slots[scale-x][z][y].draw(side)),0,0,null);
          }
        }
      }
    } else if (side == Side.EAST) {
      for (int x = 0; x < slots.length; x++) {
        for (int y = 0; y < slots[x].length; y++) {
          for (int z = 0; z < slots[x][y].length; z++) {
            g.drawImage(ImageManipulator.handleTile(slots[scale-y][z][x].draw(side)),0,0,null);
          }
        }
      }
    } else if (side == Side.WEST) {
      for (int x = 0; x < slots.length; x++) {
        for (int y = 0; y < slots[x].length; y++) {
          for (int z = 0; z < slots[x][y].length; z++) {
            g.drawImage(ImageManipulator.handleTile(slots[y][z][scale-x].draw(side)),0,0,null);
          }
        }
      }
    } else if (side == Side.BOTTOM) {
      for (int x = 0; x < slots.length; x++) {
        for (int y = 0; y < slots[x].length; y++) {
          for (int z = 0; z < slots[x][y].length; z++) {
            g.drawImage(ImageManipulator.handleTile(slots[x][scale-y][scale-z].draw(side)),0,0,null);
          }
        }
      }
    }
    g.dispose();
    return image;
  }
}
