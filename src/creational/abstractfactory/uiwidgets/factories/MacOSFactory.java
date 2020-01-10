package creational.abstractfactory.uiwidgets.factories;

import creational.abstractfactory.uiwidgets.buttons.Button;
import creational.abstractfactory.uiwidgets.buttons.MacOSButton;
import creational.abstractfactory.uiwidgets.checkboxes.Checkbox;
import creational.abstractfactory.uiwidgets.checkboxes.MacOSCheckbox;

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