package logger;

public class Console implements Loggable {


    @Override
    public void log(String text) {
        System.out.println("logging in console");
    }
}
