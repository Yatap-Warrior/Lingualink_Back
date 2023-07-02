package com.lingualink.linglink.sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sample")
@Controller
public class SampleController {

	private final static Logger logger = LogManager.getLogger(SampleController.class);

	@GetMapping("")
	public String samplePage() {
		logger.info("=============================== samplePage() ===============================");

		return "index.html";
	}

}
