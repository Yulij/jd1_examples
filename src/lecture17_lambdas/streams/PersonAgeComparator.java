package lecture17_lambdas.streams;

import java.util.Comparator;

/**
 * Class PersonAgeComparator сравнивает по убыванию
 *
 * Created by yslabko
 */
public class PersonAgeComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("Comparator person1 и person2 - >" + o1 + " " + o2);
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
