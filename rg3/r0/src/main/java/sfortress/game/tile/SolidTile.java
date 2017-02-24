package sfortress.game.tile;

import sfortress.game.item.*;
import sfortress.game.tile.*;

public class SolidTile extends Tile {
  public float hardness;
  public Item drops;
  public float meltingPoint;
  public FluidTile fluidForm;
  
  public void melt() {
    slot.setTile(fluidForm);
  }
  
  public void tick() {
    if (slot.temp >= meltingPoint) melt();
  }
}
