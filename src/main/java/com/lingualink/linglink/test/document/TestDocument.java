package com.lingualink.linglink.test.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("test")
public class TestDocument {

    @Id
    private String id;
    private String name;
    private String message;

    public TestDocument(String id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public TestDocument(String name, String message) {
        this.id = null;
        this.name = name;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "TestDocument{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
