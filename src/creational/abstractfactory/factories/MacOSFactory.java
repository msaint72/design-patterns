package creational.abstractfactory.factories;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.checkboxes.MacOSCheckbox;
import creational.abstractfactory.buttons.MacOSButton;

/**
        * Each concrete factory extends basic factory and responsible for creating
        * products of a single variety.
        */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}