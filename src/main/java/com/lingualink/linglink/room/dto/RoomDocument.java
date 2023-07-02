package com.lingualink.linglink.room.dto;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document("room")
public class RoomDocument {

	@Id
	private String id;
	private String title;
	private String detail;
	private String[] tags;
	private String language;
	private String password;
	@JsonProperty("max_participant")
	private int maxParticipant;
	@JsonProperty("participant_id")
	private String[] participantId;

	public RoomDocument(String title, String detail, String[] tags, String language, String password,
		int maxParticipant, String[] participantId) {
		this.id = null;
		this.title = title;
		this.detail = detail;
		this.tags = tags;
		this.language = language;
		this.password = password;
		this.maxParticipant = maxParticipant;
		this.participantId = participantId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMaxParticipant() {
		return maxParticipant;
	}

	public void setMaxParticipant(int maxParticipant) {
		this.maxParticipant = maxParticipant;
	}

	public String[] getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String[] participantId) {
		this.participantId = participantId;
	}

	@Override
	public String toString() {
		return "RoomDocument{" +
			"title='" + title + '\'' +
			", detail='" + detail + '\'' +
			", tags=" + Arrays.toString(tags) +
			", language='" + language + '\'' +
			", password='" + password + '\'' +
			", maxParticipant=" + maxParticipant +
			", participantId=" + Arrays.toString(participantId) +
			'}';
	}
}
