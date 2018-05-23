package lecture04.objects;

/**
 * Created by yslabko on 05/14/2018.
 */
public class ObjectsDemo {
    public static void main(String[] args) {

        Citizen c1 = new Citizen("", "", "", "");
        Citizen c2 = new Citizen("", "", "", "");
        Citizen c3 = new Citizen();

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.toString());
    }
}
