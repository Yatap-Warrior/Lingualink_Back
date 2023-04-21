package com.lingualink.linglink.test.controller;

import com.lingualink.linglink.test.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    TestService testService;

    private final static Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping("")
    public String testPage() {
        logger.info("=============================== testPage() ===============================");

        return "index.html";
    }

    @GetMapping("/insert")
    public String testInsert() {
        logger.info("=============================== insert test ===============================");

        try {
            testService.mongoInsert();
            logger.info("=============================== insert success =============================== ");
        } catch (Exception e) {
            logger.error(e.getMessage(), e.fillInStackTrace());
        }
        return "";
    }
}
