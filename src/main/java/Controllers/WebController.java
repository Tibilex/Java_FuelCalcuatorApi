package Controllers;

import Models.FuelCalculator;
import org.springframework.web.bind.annotation.PostMapping;

public class WebController {

    MainController mainController = new MainController();
    @PostMapping("/travelCost")
    public void travelCost(FuelCalculator calculator){
        mainController.travelCost(calculator);
    }
    @PostMapping("/AVS")
    public void averageFuelConsumption(FuelCalculator calculator){
        mainController.averageFuelConsumption(calculator);
    }
    @PostMapping("/fuelIsEnough")
    public void HowMuchFuelIsEnough(FuelCalculator calculator){
        mainController.HowMuchFuelIsEnough(calculator);
    }
}
