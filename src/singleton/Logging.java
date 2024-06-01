package singleton;


import java.time.LocalTime;

public class Logging {
    private static Logging logging;

    private Logging() {
    }

    public void log(Object obj, String info) {
        System.out.println(logging);
        System.out.println("Lof info: " + LocalTime.now() + " " + obj.getClass().getName() + " " + info);
    }

    public static Logging getInstance() {
        if (logging == null) {
            logging = new Logging();
        }
        return logging;
    }
}
