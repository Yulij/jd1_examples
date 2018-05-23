package lecture04.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yslabko on 05/14/2018.
 */

@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
    private String firstName;
    private String lastName;
    private String id;
    private String birth;


}
