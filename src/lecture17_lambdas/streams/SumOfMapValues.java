package lecture17_lambdas.streams;

import java.util.HashMap;
import java.util.Map;


public class SumOfMapValues {
    /**
     * Подсчитать сумму значений мапки, ключи которой короче 7 символов
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Not valid string", 999);
        map.put("abc", 10);
        map.put("efg", 30);

        int sum = map.entrySet()
                .stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
