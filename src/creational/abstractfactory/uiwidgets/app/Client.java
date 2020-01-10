package creational.abstractfactory.uiwidgets.app;

import creational.abstractfactory.uiwidgets.factories.GUIFactory;
import creational.abstractfactory.uiwidgets.factories.MacOSFactory;
import creational.abstractfactory.uiwidgets.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Client {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}