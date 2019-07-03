package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class WelcomeRestController {

	@RequestMapping(value="/rest", method=RequestMethod.GET)
	public String Welcome() {
		return "Rest application is working";
	}
}
