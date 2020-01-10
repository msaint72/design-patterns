package creational.factorymethod.logger;

//ConcreteCreator
public class XMLLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        XMLLogger logger = new XMLLogger();
        return (Logger) logger;
    }
}
