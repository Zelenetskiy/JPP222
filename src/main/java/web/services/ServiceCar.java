package web.services;

import web.model.Car;
import java.util.List;

public interface ServiceCar {

    List<Car> getCars(int count);

    int getSizeCarList();

}
