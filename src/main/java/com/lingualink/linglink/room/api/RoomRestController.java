package com.lingualink.linglink.room.api;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lingualink.linglink.room.document.RoomDocument;
import com.lingualink.linglink.room.service.RoomService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "rooms", tags = {"swagger", "v1", "api"})
@RequestMapping("/v1/rooms")
@RestController
public class RoomRestController {

	private static final Logger logger = LogManager.getLogger(RoomRestController.class);

	@Autowired
	private RoomService roomService;

	@ApiOperation(value = "findAllRooms", notes = "언어와 키워드로 필터링한 입장 가능한 모든 방을 List<RoomDocument> 형식으로 return")
	@GetMapping(value = "")
	public List<RoomDocument> findAllRooms(
		@RequestParam(name = "language") String language,
		@RequestParam(name = "keyword", required = false) String keyword) {
		// TODO: ResponseEntity Custom & Return as ResponseEntity
		List<RoomDocument> roomDocuments = null;

		if (keyword == null)
			keyword = "";

		try {
			logger.info("findAllRooms - language = '" + language + "' & keyword = '" + keyword + "'");
			roomDocuments = roomService.findAllRooms(language, keyword);

		} catch (Exception ex) {
			logger.info(ex.getMessage());
			logger.info(ex.getCause());
		}
		return roomDocuments;
	}
}
