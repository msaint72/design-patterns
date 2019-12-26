package builder.car;

import builder.car.cars.Type;
import builder.car.components.Engine;
import builder.car.components.GPSNavigator;
import builder.car.components.Transmission;
import builder.car.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
