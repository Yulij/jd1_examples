package lecture12_exceptions.logger;

import org.apache.log4j.Logger;

/**
 * Class LoggerExample
 *
 * Created by yslabko on 12/18/2017.
 */
public class LoggerExample {
    final static Logger LOGGER = Logger.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        LoggerExample obj = new LoggerExample();
        obj.runMe("Yuli");
    }

    private void runMe(String parameter) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("This is debug : " + parameter);
        }
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("This is info : " + parameter);
        }
        LOGGER.info("This is info demo : " + parameter);
        LOGGER.warn("This is warn : " + parameter);
        LOGGER.error("This is error : " + parameter);
        LOGGER.fatal("This is fatal : " + parameter);
    }
}
