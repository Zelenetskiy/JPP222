package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.ServiceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        Car toyota = new Car("Toyota","Land Cruiser", 2020);
        Car honda = new Car("Honda","C-RV", 2019);
        Car nissan = new Car("Nissan","Patrol", 2021);
        Car lexus = new Car("Lexus","LX", 2022);
        Car mitsubishi = new Car("Mitsubishi","Pajero Sport", 2021);

        List<Car> listCars = new ArrayList<>();
        listCars.add(toyota);
        listCars.add(honda);
        listCars.add(nissan);
        listCars.add(lexus);
        listCars.add(mitsubishi);
        if (count == null) {
            count = listCars.size();
        }

        listCars = ServiceCar.getCars(listCars, count);

        model.addAttribute("carList", listCars);



        return "cars";
    }
}
