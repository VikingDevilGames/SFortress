package sfortress.game.item;

import sfortress.graphics.image.ItemIcon;

public class Item {
  public ItemIcon icon;
  public String name;
  public String id;

  public String[] categories;

  public static boolean inCategories(Item item,String[] categories) {
    boolean k = false;
    for (int i = 0; i < item.categories.length; i++) {
      for (int k = 0; k < categories.length; k++) {
        k = (k && (item.categories[i] == categories[k]));
      }
    }
    return k;
  }
  public boolean inCategories(String[] categories) {
    return inCategories(this,categories);
  }
}
