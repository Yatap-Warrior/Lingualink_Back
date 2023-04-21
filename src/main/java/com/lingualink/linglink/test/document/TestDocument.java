package com.lingualink.linglink.test.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("test")
public class TestDocument {

    @Id
    private Long id;
    private String name;
    private String message;

    public TestDocument(Long id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setId(Long id) {
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
