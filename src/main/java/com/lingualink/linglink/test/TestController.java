package com.lingualink.linglink.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@Controller
public class TestController {

    private final static Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping("")
    public String testPage() {
        logger.info("=============================== testPage() ===============================");

        return "index.html";
    }

}
