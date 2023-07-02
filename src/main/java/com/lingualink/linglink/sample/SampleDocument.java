package com.lingualink.linglink.sample;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("test")
public class SampleDocument {

	@Id
	private String id;
	private String name;
	private String message;

	public SampleDocument(String name, String message) {
		this.id = null;
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
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
			", name='" + name + '\'' +
			", message='" + message + '\'' +
			'}';
	}
}
