package sfortress.game.tile;

import sfortress.game.tile.*;

public class SolidTile extends Tile {
  public float hardness;
  public float meltingPoint;
  public FluidTile fluidForm;
  
  public void tick() {
    if (slot.temp >= meltingPoint) melt();
  }
}
