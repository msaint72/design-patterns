package creational.abstractfactory.uiwidgets.factories;

import creational.abstractfactory.uiwidgets.buttons.Button;
import creational.abstractfactory.uiwidgets.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}