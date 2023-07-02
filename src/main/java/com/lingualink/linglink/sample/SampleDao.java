package com.lingualink.linglink.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void sampleInsert(String name, String message) throws Exception {
		SampleDocument sample = new SampleDocument(name, message);
		mongoTemplate.insert(sample);
	}

	public List<SampleDocument> sampleFind(String key, String val) throws Exception {
		Query query = new Query(new Criteria(key).is(val));

		return mongoTemplate.find(query, SampleDocument.class, "test");
	}

	public void sampleDelete(String key, String val) throws Exception {
		Query query = new Query(new Criteria(key).is(val));
		mongoTemplate.remove(query);
	}
}
