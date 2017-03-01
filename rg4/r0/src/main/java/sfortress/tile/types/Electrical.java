package sfortress.tile.types;

public interface Electrical {
  private float resistivity;
  private float voltage;
  private float current;
  
  public static float getVoltage(Elecrical e) {
    return e.voltage - (e.voltage / e.resistance / e.resistance);
  }
  public static float getCurrent(Elecrical e) {
    return getVoltage(e) / e.resistance;
  }
  public static float getPower(Electrical e) {
    return getVoltage(e) * getCurrent(e);
  }
  public static float getEnergy(int seconds) {
    return getPower(e) * seconds;
  }
}
