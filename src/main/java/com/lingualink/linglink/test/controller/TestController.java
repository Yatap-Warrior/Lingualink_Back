package com.lingualink.linglink.test.controller;

import com.lingualink.linglink.test.document.TestDocument;
import com.lingualink.linglink.test.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("insert/{name}/{value}")
    public String testInsert(@PathVariable("name") String name,
                             @PathVariable("value") String value) {
        logger.info("=============================== insert test ===============================");

        try {
            testService.mongoInsert(name, value);
            logger.info("=============================== insert success =============================== ");

        } catch (Exception e) {
            logger.error(e.getMessage(), e.fillInStackTrace());
        }
        return "";
    }

    @ResponseBody
    @GetMapping(value = "find/{key}/{value}", produces = "application/json;charset=UTF-8")
    public List<TestDocument> testFind(@PathVariable("key") String key,
                                       @PathVariable("value") String value) {
        logger.info("=============================== testInfo() ===============================");
        List<TestDocument> result = null;

        try {
            result = testService.mongoFind(key, value);

            for (TestDocument r: result) {
                logger.info(r.toString());
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e.fillInStackTrace());
        }
        return result;
    }
}
