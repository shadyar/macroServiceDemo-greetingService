package ir.hampa.credit;

import org.springframework.web.bind.annotation.RequestMapping;

public interface Greeting {
	@RequestMapping("/greeting")
	String greeting();
}