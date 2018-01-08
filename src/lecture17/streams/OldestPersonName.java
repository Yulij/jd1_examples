package lecture17.streams;

import lecture17.streams.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestPersonName {

    /**
     * Вывести самого старшего человека, у которого имя и фамилия менее 15 символов
     * @param args
     */
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alex", "Mercer", 30),
                new Person("Michael", "Kane", 80),
                new Person("Elizabeth", "Watson", 90));

        String fullName = people.stream()
                .filter(person -> (person.getFirstName() + person.getLastName()).length() < 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .findFirst().get();
        System.out.println(fullName);
    }
}
