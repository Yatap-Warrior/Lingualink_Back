package com.lingualink.linglink.room.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@Document(collection = "rooms")
public class RoomDocument {

	@Id
	private String id;
	private String title;
	private String detail;
	private List<String> tags;
	private String language;
	private String password;
	@JsonProperty("max_participant")
	private Integer maxParticipant;
	@JsonProperty("participant_id")
	private List<String> participantId;

	public RoomDocument(String title, String detail, List<String> tags, String language, String password,
		Integer maxParticipant, List<String> participantId) {
		this.id = null;
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

	@JsonGetter("max_participant")
	public Integer getMaxParticipant() {
		return maxParticipant;
	}

	@JsonSetter("max_participant")
	public void setMaxParticipant() {
		this.maxParticipant = maxParticipant;
	}

	@JsonGetter("participant_id")
	public List<String> getParticipantId() {
		return participantId;
	}

	@JsonSetter("participant_id")
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
