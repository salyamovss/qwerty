package global.testaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@Controller
public class TestAwsApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestAwsApplication.class, args);
    }

    @GetMapping("/hello")
    public String index(){
        return "index";
    }

}
