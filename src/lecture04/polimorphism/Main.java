package lecture04.polimorphism;
import lecture04.polimorphism.CarInsurance;
import lecture04.polimorphism.Insurance;

public class Main {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();

        // Динамическое связывание на основе объекта
        int premium = current.premium();

        // Статическое связывание на основе класса
        String category = current.category();

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}