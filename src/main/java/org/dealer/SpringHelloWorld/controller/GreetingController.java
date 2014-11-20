package org.dealer.SpringHelloWorld.controller;

import org.dealer.SpringHelloWorld.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	private static final String template = "Hello, %s!";
	
	@RequestMapping("/greeting")
	@ResponseBody
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		System.out.println("Controller intercepted " + name);
		return new Greeting(String.format(template, name));
	}
}
