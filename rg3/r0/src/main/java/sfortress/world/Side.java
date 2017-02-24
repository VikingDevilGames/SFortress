package sfortress.world;

public enum Side {
  TOP("Top","Upper"),
  NORTH("North","Northern"),
  SOUTH("South","Southern"),
  EAST("East","Eastern"),
  WEST("West","Western"),
  BOTTOM("Bottom","Lower");
  
  public String name;
  public String directionSide;
  private Side(String name, String directionSide) {
    this.name = name;
    this.directionSide = directionSide;
  }
}
