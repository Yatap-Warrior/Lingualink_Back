package com.lingualink.linglink.test.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

    private final static Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping("")
    public String testPage() {
        logger.info("log test ----------------------------------------------- testPage()");

        return "index.html";
    }
}
