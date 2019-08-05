package jUnit;

public class Divider {
   public static Double divide(Integer argument1, Integer argument2) {
       if (argument1 == null || argument2 == null) {
           throw new IllegalArgumentException("Arguments should not be null");
       }

       if (argument2 == 0) {
           return 0.;
       }
       return (double)argument1/argument2;
   }
}