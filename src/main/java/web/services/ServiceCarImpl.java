package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCarImpl implements ServiceCar {

    private Car toyota = new Car("Toyota","Land Cruiser", 2020);
    private Car honda = new Car("Honda","C-RV", 2019);
    private Car nissan = new Car("Nissan","Patrol", 2021);
    private Car lexus = new Car("Lexus","LX", 2022);
    private Car mitsubishi = new Car("Mitsubishi","Pajero Sport", 2021);
    private List<Car> listCars = new ArrayList<>();
    {
        listCars.add(toyota);
        listCars.add(honda);
        listCars.add(nissan);
        listCars.add(lexus);
        listCars.add(mitsubishi);
    }


    @Override
    public List<Car> getCars(int count) {

        if (count >= listCars.size() || count <= 1) {
            return listCars;
        }
        return listCars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public int getSizeCarList(){

        return listCars.size();
    }
}