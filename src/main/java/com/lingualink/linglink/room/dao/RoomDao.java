package com.lingualink.linglink.room.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.lingualink.linglink.global.enums.RoomEnum;
import com.lingualink.linglink.room.api.RoomRestController;
import com.lingualink.linglink.room.document.RoomDocument;

@Repository
public class RoomDao {
	private static final Logger logger = LogManager.getLogger(RoomRestController.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<RoomDocument> findAllRooms(String language) throws Exception {
		return mongoTemplate.find(
			Query.query(Criteria
				.where(RoomEnum.LANGUAGE.asString()).is(language))
			, RoomDocument.class
			, "rooms");
	}

	public List<RoomDocument> findAllRooms(String language, String keyword) throws Exception {
		return mongoTemplate.find(
			Query.query(Criteria
				.where(RoomEnum.LANGUAGE.asString()).is(language)
				.and(RoomEnum.KEYWORD.asString()).regex(keyword))
			, RoomDocument.class
			, "rooms");
	}
}
