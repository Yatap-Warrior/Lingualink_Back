package com.lingualink.linglink.test.service;

import com.lingualink.linglink.test.document.TestDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void mongoInsert() {
        TestDocument test = new TestDocument(1L, "테스트", "테스트테스트");
        mongoTemplate.insert(test);
    }
}
