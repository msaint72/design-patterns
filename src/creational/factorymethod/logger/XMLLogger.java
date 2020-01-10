package creational.factorymethod.logger;

//concrete implementation of the Logger (Product)
public class XMLLogger implements Logger {
    public void log(String message) {
        // log to xml
        System.err.println("logging");
    }
}

