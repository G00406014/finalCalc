package ie.atu.hello;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/calculate")
public class CalCulatorController {

    public static void main(String[] args) {
        SpringApplication.run(CalCulatorController.class, args);

    }
    @GetMapping
    public CalCulationResults calculate(
            @RequestParam int num1,
            @RequestParam int num2,
            @RequestParam String operation
    ) {

        int total = 0;
        switch (operation) {
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                break;
            case "multiply":
                total = num1 * num2;
                break;
            case "divide":
                total = num1 / num2;
                break;
        }

        return new CalCulationResults(operation, total);
    }

    @GetMapping("/addition/{num1}/{num2}")
    public String addition(@PathVariable Integer num1, @PathVariable Integer num2) {
        return String.valueOf(num1 + num2);
    }

    @GetMapping("/multiplication/{num1}/{num2}")
    public String multiplication(@PathVariable Integer num1, @PathVariable Integer num2) {
        return String.valueOf(num1 * num2);
    }

    @GetMapping("/divison/{num1}/{num2}")
    public String division(@PathVariable Integer num1, @PathVariable Integer num2) {
        return String.valueOf(num1 / num2);
    }

    @GetMapping("/substitution/{num1}/{num2}")
    public String substitution(@PathVariable Integer num1, @PathVariable Integer num2) {
        return String.valueOf(num1 - num2);
    }
}
