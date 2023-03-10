package Controllers;

import Models.FuelCalculator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainController {
    FuelCalculator FuelCalculator = new FuelCalculator();
    @PostMapping("/travelCost")
    public void travelCost(FuelCalculator calculator){
        FuelCalculator FuelCalculator;
        FuelCalculator = calculator;
        FuelCalculator.travelCost();
    }
    @PostMapping("/AVS")
    public void averageFuelConsumption(FuelCalculator calculator){
        calculator.averageFuelConsumption();
    }
    @PostMapping("/fuelIsEnough")
    public void HowMuchFuelIsEnough(FuelCalculator calculator){
        calculator.HowMuchFuelIsEnough();
    }
}
