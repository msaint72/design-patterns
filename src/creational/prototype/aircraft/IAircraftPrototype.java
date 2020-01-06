package creational.prototype.aircraft;

public interface IAircraftPrototype {
    void fly();

    IAircraftPrototype clone();

    void setEngine(F16Engine f16Engine);
}
