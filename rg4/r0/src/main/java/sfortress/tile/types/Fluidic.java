package sfortress.tile.types;

public interface Fluidic {
  protected Fluid fluid;
  protected float amount;
  protected float maxAmount;
  protected float pressure;
  protected float friction;
  
  public static float getPressure() {
    return p.pressure - p.friction;
  }
  public static float getCurrent() {
    return getPressure(p) / p.amount;
  }
  public static boolean isEmpty() {
    return (f.amount == 0 && f.fluid == null);
  }
}
