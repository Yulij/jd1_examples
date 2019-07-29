package lecture04.polimorphism;

public class CarInsurance extends Insurance{
    public static final int HIGH = 200;

    public void print() {}

    @Override
    public int premium(){
        return HIGH;
    }

    public static String category(){
        return "Car Insurance";
    }

}