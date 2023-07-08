package com.lingualink.linglink.sample;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "sample", tags = {"sample"})
@RequestMapping("/v0/sample")
@RestController
public class SampleRestController {

	private static final Logger logger = LogManager.getLogger(SampleRestController.class);

	@Autowired
	public SampleService sampleService;

	@ApiOperation(value = "delete sample")
	@DeleteMapping("/{key}/{value}")
	public String testDelete(@PathVariable("key") String key, @PathVariable("value") String value) {
		try {
			sampleService.sampleDelete(key, value);
		} catch (Exception e) {
			logger.info(e.getMessage(), e.fillInStackTrace());
		}
		return "";
	}

	@ApiOperation(value = "insert sample")
	@PostMapping("/{key}/{value}")
	public String sampleInsert(@PathVariable("key") String name,
		@PathVariable("value") String value) {
		logger.info("=============================== insert test ===============================");

		try {
			sampleService.sampleInsert(name, value);
			logger.info("=============================== insert success =============================== ");

		} catch (Exception e) {
			logger.error(e.getMessage(), e.fillInStackTrace());
		}
		return "";
	}

	@ApiOperation(value = "read sample")
	@ResponseBody
	@GetMapping(value = "/{key}/{value}", produces = "application/json;charset=UTF-8")
	public List<SampleDocument> testFind(@PathVariable("key") String key,
		@PathVariable("value") String value) {
		logger.info("=============================== testInfo() ===============================");
		List<SampleDocument> result = new ArrayList<>();

		try {
			result = sampleService.sampleFind(key, value);

			for (SampleDocument r : result) {
				logger.info(r.toString());
			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e.fillInStackTrace());
		}
		return result;
	}
}
