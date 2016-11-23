package contatos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
