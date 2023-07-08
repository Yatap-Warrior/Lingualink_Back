package com.lingualink.linglink.room.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "rooms")
public class RoomDocument {

	@Id
	private String id;
	private String title;
	private String detail;
	private List<String> tags;
	private String language;
	private String password;
	@Field("max_participant")
	private Integer maxParticipant;
	@Field("participant_id")
	private List<String> participantId;

	public RoomDocument(String title, String detail, List<String> tags, String language, String password,
		Integer maxParticipant, List<String> participantId) {
		this.title = title;
		this.detail = detail;
		this.tags = tags;
		this.language = language;
		this.password = password;
		this.maxParticipant = maxParticipant;
		this.participantId = participantId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
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

	public Integer getMaxParticipant() {
		return maxParticipant;
	}

	public void setMaxParticipant(Integer maxParticipant) {
		this.maxParticipant = maxParticipant;
	}

	public List<String> getParticipantId() {
		return participantId;
	}

	public void setParticipantId(List<String> participantId) {
		this.participantId = participantId;
	}

	@Override
	public String toString() {
		return "RoomDocument{" +
			"title='" + title + '\'' +
			", detail='" + detail + '\'' +
			", tags=" + tags +
			", language='" + language + '\'' +
			", password='" + password + '\'' +
			", maxParticipant=" + maxParticipant +
			", participantId=" + participantId +
			'}';
	}
}
