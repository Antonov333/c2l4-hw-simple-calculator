package pro.sky.C2L4homeworksimplecalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int userNum1, @RequestParam("num2") int userNum2) {
        return calculatorService.plus(userNum1, userNum2);
    }

   /* @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int userNum1) {
        return calculatorService.plus(userNum1) ;
    }

    @GetMapping(path = "/calculator/plus")
    public String plus() {
        return calculatorService.plus() ;
    } */

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divide(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiply(num1, num2);
    }


}
