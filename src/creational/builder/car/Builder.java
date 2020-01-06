package creational.builder.car;

import creational.builder.car.cars.Type;
import creational.builder.car.components.Engine;
import creational.builder.car.components.GPSNavigator;
import creational.builder.car.components.Transmission;
import creational.builder.car.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
