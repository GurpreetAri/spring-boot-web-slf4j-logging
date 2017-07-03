package com.testlog;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@ResponseBody
	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> model) {

		logger.debug("Welcome {}", " DebugTester! "); //Debug+Info+Error
        logger.info("Welcome {}", " InfoTester! "); //Info + Error
        logger.trace("Welcome {}", " TraceTester! "); //Debug+Info+Trace+Error
        logger.error("Welcome {}", " ErrorTester! ");//Only Error

		System.out.println("Welcome to the testlog application!");
		return "Welcome to the testlog application!";
	}

}