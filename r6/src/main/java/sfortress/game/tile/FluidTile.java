package sfortress.game.tile;

import sfrortress.game.tile.*;

public class FluidTile extends Tile {
  public int viscosity;
  
  public void tick() {
    ticks++;
    if (ticks > viscosity*1000) {}
  }
  public void attemptFlow() {
    slot.attemptFlow();
  }
}
