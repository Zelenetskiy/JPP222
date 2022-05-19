package web.services;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceCar {

    public static List<Car> getCars(List<Car> listCars, Integer count) {

        if (count >= listCars.size() || count <= 1) {
            return listCars;
        }
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}