package com.lingualink.linglink.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public void mongoInsert(String name, String value) throws Exception {
        testDao.testInsert(name, value);
    }

    public List<TestDocument> mongoFind(String key, String val) throws Exception {
        return testDao.testFind(key, val);
    }

    public void mongoDelete(String key, String val) throws Exception {
        testDao.testDelete(key, val);
    }
}
