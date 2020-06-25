import java.util.Formatter;
import java.util.logging.*;

public class Main {

    private static final Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
    private static final Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
    private static final Logger LOGGER3 = Logger.getLogger("org.stepic.java");
    private static final ConsoleHandler ch = new ConsoleHandler();
    public static final XMLFormatter form = new XMLFormatter();


    private static void configureLogging() {
        LOGGER1.setLevel(Level.ALL);
        LOGGER2.setLevel(Level.WARNING);
        LOGGER3.setUseParentHandlers(false);
        ch.setLevel(Level.ALL);
        LOGGER3.addHandler(ch);
        ch.setFormatter(form);
    }
}
