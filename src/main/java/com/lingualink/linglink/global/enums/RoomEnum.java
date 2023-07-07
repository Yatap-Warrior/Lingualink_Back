package com.lingualink.linglink.global.enums;

public enum RoomEnum {
	LANGUAGE("language"),
	KEYWORD("title");

	private final String value;

	RoomEnum(String value) {
		this.value = value;
	}

	public String asString() {
		return value;
	}
}
