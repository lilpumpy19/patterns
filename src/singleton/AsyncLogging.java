package singleton;

import java.time.LocalTime;

public class AsyncLogging {

    private volatile static AsyncLogging asyncLogging;

    private AsyncLogging() {
    }

    public void log(Object obj, String info) {
        System.out.println(asyncLogging);
        System.out.println("Lof info: " + LocalTime.now() + " " + obj.getClass().getName() + " " + info);
    }

    public static AsyncLogging getInstance() {
        if (asyncLogging == null) {
            synchronized (AsyncLogging.class) {
                if (asyncLogging == null) {
                    asyncLogging = new AsyncLogging();
                }
            }
        }
        return asyncLogging;
    }
}
