package lecture04.constructors;

/**
 * Created by yslabko on 12/06/2017.
 */
public abstract class A {
    private String text;
    String content;
    public abstract void print();
    protected void printHi() {
        System.out.println("Hi, from A class!");
    }
    public void display() {
        System.out.println("display");
    }
}
