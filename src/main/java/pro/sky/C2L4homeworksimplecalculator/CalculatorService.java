package pro.sky.C2L4homeworksimplecalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hint() {
        return
                "Hi! <br><br>Use \\calculator address to reach simple calculator";
    }

    public String welcome() {
        return "Welcome to simple calculator!<br><br>" +
                "Use addresses as follows to perform math ops";
    }

}
