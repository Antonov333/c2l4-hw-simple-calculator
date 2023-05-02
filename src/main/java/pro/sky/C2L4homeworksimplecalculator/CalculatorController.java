package pro.sky.C2L4homeworksimplecalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping
    public String hint() {
        return calculatorService.hint();
    }

    @GetMapping(path = "/calculator")
    public String welcome() {
        return calculatorService.welcome();
    }


}
