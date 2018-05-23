package lecture08_generics_annotations.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class Fio
 *
 * Created by yslabko on 05/23/2018.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Fio {
    String firstName() default "";
    String lastName() default "";
    String fathersName() default "";
}
