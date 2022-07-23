package Spring.boot.Camp.Dio;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {

    @GetMapping("/")
    public String helloMassege() {

        return "Hello, Spring Boot";
    }

}
