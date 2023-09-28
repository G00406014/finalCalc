package ie.atu.hello;

import ie.atu.hello.CalCulatorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1application {

    public static void main(String[] args) {
        SpringApplication.run(CalCulatorController.class, args);
    }

}
