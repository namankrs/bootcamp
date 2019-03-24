package logger;

public class LogFile implements  Loggable{
    @Override
    public void log(String text) {
        System.out.println("logging Im file");
    }
}
