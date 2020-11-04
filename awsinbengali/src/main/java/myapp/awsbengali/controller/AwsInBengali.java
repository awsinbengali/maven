package myapp.awsbengali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AwsInBengali {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my Channel";
	}
}
