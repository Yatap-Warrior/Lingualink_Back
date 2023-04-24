package com.lingualink.linglink.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "test", tags = {"swagger", "v1", "api"})
@RequestMapping("/v1/test")
@RestController
public class TestRestController {

    private static final Logger logger = LogManager.getLogger(TestRestController.class);

    @Autowired
    public TestService testService;

    @ApiOperation(value = "delete test", notes = "ㅠㅠ")
    @DeleteMapping("/{key}/{value}")
    public String testDelete(@PathVariable("key") String key, @PathVariable("value") String value) {
        try {
            testService.mongoDelete(key, value);
        } catch (Exception e) {
            logger.info(e.getMessage(), e.fillInStackTrace());
        }
        return "";
    }

    @ApiOperation(value = "insert test", notes = "0.0")
    @PostMapping("/{key}/{value}")
    public String testInsert(@PathVariable("key") String name,
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

    @ApiOperation(value = "read test", notes = "ㅎㅎ")
    @ResponseBody
    @GetMapping(value = "/{key}/{value}", produces = "application/json;charset=UTF-8")
    public List<TestDocument> testFind(@PathVariable("key") String key,
                                       @PathVariable("value") String value) {
        logger.info("=============================== testInfo() ===============================");
        List<TestDocument> result = new ArrayList<>();

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
