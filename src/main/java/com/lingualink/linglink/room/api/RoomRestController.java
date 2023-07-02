package com.lingualink.linglink.room.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lingualink.linglink.room.service.RoomService;

import io.swagger.annotations.Api;

@Api(value = "rooms", tags = {"swagger", "v1", "api"})
@RequestMapping("/v1/rooms")
@RestController
public class RoomRestController {

	private static final Logger logger = LogManager.getLogger(RoomRestController.class);

	@Autowired
	private RoomService roomService;
}
