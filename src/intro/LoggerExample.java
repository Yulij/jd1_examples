package intro;

import org.apache.log4j.Logger;

/**
 * Created by yslabko on 12/18/2017.
 */
public class LoggerExample {
    final static Logger logger = Logger.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        LoggerExample obj = new LoggerExample();
        obj.runMe("Yuli");
    }

    private void runMe(String parameter) {
        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + parameter);
        }
        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + parameter);
        }
        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
    }
}
