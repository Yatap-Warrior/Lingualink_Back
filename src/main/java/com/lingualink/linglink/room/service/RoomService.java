package com.lingualink.linglink.room.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingualink.linglink.room.dao.RoomDao;

@Service
public class RoomService {

	@Autowired
	private RoomDao roomDao;
}
