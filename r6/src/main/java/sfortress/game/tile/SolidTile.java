package sfortress.game.tile;

import sfortress.game.tile.*;

public class SolidTile extends Tile {
  public float hardness;
  public Item drops;
  public float meltingPoint;
  public FluidTile fluidForm;
  
  public void set(TileSlot slot) {
    this.slot = slot;
  }
  
  public void tick() {
    if (slot.temp >= this.meltingPoint) melt();
  }
  public void melt() {
    slot.setTile(fluidForm.fabricate());
  }
}
