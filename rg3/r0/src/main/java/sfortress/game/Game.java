package sfortress.game;

import sfortress.world.Position;
import sfortress.world.World;

public class Game {
  public static World world;
  public static Position viewerPos;
  
  public static void init() {
    world = new World();
    viewerPos = new Position(0,world.getGroundHeight(0,0),0);
  }
}
