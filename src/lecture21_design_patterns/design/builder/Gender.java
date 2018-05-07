package lecture21_design_patterns.design.builder;

/**
 * @author yslabko
 */
public enum Gender implements Informable {

    MALE {
        @Override
        public String getInformation() {
            return "Male";
        }
    },
    FEMALE {
        @Override
        public String getInformation() {
            return "Female";
        }
    }
}
