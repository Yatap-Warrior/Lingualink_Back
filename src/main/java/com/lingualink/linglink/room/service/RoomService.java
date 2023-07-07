package com.lingualink.linglink.room.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingualink.linglink.room.dao.RoomDao;
import com.lingualink.linglink.room.document.RoomDocument;

@Service
public class RoomService {

	@Autowired
	private RoomDao roomDao;

	public List<RoomDocument> findAllRooms(String language, String keyword) throws Exception {
		if ("".equals(keyword)) {
			return roomDao.findAllRooms(language);
		} else {
			return roomDao.findAllRooms(language, keyword);
		}
	}
}
