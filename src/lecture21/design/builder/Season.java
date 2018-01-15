package lecture21.design.builder;

/**
 * @author yslabko
 */
public enum Season implements Informable {
    WINTER {
        @Override
        public String getInformation() {
            return "winter";
        }
    }, SPRING {
        @Override
        public String getInformation() {
            return "spring";
        }
    }, SUMMER {
        @Override
        public String getInformation() {
            return "summer";
        }
    },
    AUTUMN {
        @Override
        public String getInformation() { return "autumn"; }
    }
}
