package sfortress.tile;

import sfortress.graphics.image.MachineIcon;
import sfortress.tile.type.*;

public abstract class MachineTile extends Tile implements Switchable {
  public MachineIcon icon;
  
  protected int[] ticks;
  
  public absract MachineTile fabricate();
  public abstract void run();
  
  public void tick() {
    super.tick();
    ticks[0] = (ticks[0] == ticks[1])?0:ticks[0]++;
    if (ticks == 0) {
      run();
    }
  }
}
