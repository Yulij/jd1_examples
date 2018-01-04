package lecture07.inner.ship;

/**
 * Class Ship
 *
 * Created by yslabko on 12/14/2017.
 */
public class Ship {
  private int id;
  /* abstract, final, private,
     protected - допустимы */
  public static class LifeBoat {
    public static void down() {
      show("шлюпки на воду!");
    }

    public void swim() {
      show("отплытие шлюпки");
    }

    public static void show(String s) {
      System.out.println(s);
    }
  }
}