package lecture21_design_patterns.design.builder;

/**
 * @author yslabko
 */
public enum Substance implements Informable {
    AIR {
        @Override
        public String getInformation() {
            return "Air";
        }
    }, FIRE {
        @Override
        public String getInformation() {
            return "Fire";
        }
    }, WATER {
        @Override
        public String getInformation() {
            return "Water";
        }
    }, EARTH {
        @Override
        public String getInformation() {
            return "Earth";
        }
    }
}
