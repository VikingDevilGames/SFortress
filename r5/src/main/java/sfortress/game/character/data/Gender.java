package sfortress.game.character.data;

public final enum Gender {
  FEMALE("Female","She","Her","Her","Hers"),
  MALE("Male","He","Him","His","His");

  public String name;
  public String heShe;
  public String himHer;
  public String hisHer;
  public String hisHers;

  private Gender(String name, String heShe, String himHer, String hisHer, String hisHers) {
    this.name = name;
    this.heShe = heShe;
    this.himHer = himHer;
    this.hisHer = hisHer;
    this.hisHers = hisHers;
  }

  private boolean c(String s,String cz) {
    return s.contains(cz);
  }
  public String c(String var) {
    String k = var.replace("%_gender_%",name).replace("%_(s)he_%",heShe).replace("%_him/her_%",himHer).replace("%_his/her_%",hisHer).replace("%_his/hers_%",hisHers);
    String g = k.replace("%%","%");
    return g;
  }
}
