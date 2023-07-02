package com.lingualink.linglink.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired
	private SampleDao sampleDao;

	public void sampleInsert(String name, String value) throws Exception {
		sampleDao.sampleInsert(name, value);
	}

	public List<SampleDocument> sampleFind(String key, String val) throws Exception {
		return sampleDao.sampleFind(key, val);
	}

	public void sampleDelete(String key, String val) throws Exception {
		sampleDao.sampleDelete(key, val);
	}
}
