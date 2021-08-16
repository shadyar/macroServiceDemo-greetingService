package ir.hampa.credit;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GreetingRestController implements Greeting {

    @Override
    public String greeting() {
    	log.info("Hello word from GreetingServicee, returned by {}", this.getClass().getName());
        return "Hello word from GreetingServicee";
    }
}
