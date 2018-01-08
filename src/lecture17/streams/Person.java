package lecture17.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private final String firstName;
    private String lastName;
    private int age;
}
