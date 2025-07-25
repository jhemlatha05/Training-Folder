package practice_day2tasks;

interface Logger {
    default void logInfo() {
        System.out.println("INFO: Logging info");
    }

    static void logError() {
        System.out.println("ERROR: Logging error");
    }
}

class AppLogger implements Logger {
    // No need to override default method unless custom logic is needed
}

public class Java8_interface {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        logger.logInfo();         // Calls default method
        Logger.logError();        // Calls static method
    }
}


