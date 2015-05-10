package threads;


public class Logger {

    private Logger() {
    }

    public static Logger myInstance;

    public static class LoggerHolder {

        public static Logger logger = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHolder.logger;
    }

    public void log(String s) {
        System.err.println(s);
    }
}

//public class Logger {
//
//    private Logger() {
//    }
//
//    public static Logger myInstance;
//
//    public static synchronized  Logger getInstance() {
////        synchronized (Logger.class) {
//        if (myInstance == null) {
//                myInstance = new Logger();
//                System.out.println(myInstance);
//            }
////        }
//        return myInstance;
//    }
//
//    public void log(String s) {
//        System.err.println(s);
//    }
//}
