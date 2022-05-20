package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.ServiceCar;

@Controller
public class CarsController {
    @Autowired
    private ServiceCar serviceCar;

    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count == null) {
            count = serviceCar.getSizeCarList();
        }

        model.addAttribute("carList", serviceCar.getCars(count));

        return "cars";
    }
}
