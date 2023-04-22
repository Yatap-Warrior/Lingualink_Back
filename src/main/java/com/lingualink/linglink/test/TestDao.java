package com.lingualink.linglink.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void testInsert(String name, String message) throws Exception {
        TestDocument test = new TestDocument(name, message);
        mongoTemplate.insert(test);
    }

    public List<TestDocument> testFind(String key, String val) throws Exception {
        Query query = new Query(new Criteria(key).is(val));

        return mongoTemplate.find(query, TestDocument.class, "test");
    }
}
