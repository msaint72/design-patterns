package creational.abstractfactory.uiwidgets.app;

import creational.abstractfactory.uiwidgets.buttons.Button;
import creational.abstractfactory.uiwidgets.checkboxes.Checkbox;
import creational.abstractfactory.uiwidgets.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}