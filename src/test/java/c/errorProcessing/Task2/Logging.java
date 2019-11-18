package c.errorProcessing.Task2;

import org.apache.log4j.Logger;

public class Logging {
    private static final Logger log = Logger.getLogger(Logging.class);

    private static void runFirstMethod() {
        System.out.println("First private method.");
        log.info("Private method was called");
    }

    public static void runSecondMethod() {
        log.error("Test error log");
        System.out.println("Second public method.");
        runFirstMethod();
        log.info("Public method was called");
    }
}