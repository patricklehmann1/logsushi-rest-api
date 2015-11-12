package com.booxware;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LoggingEventPropertyId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "event_id")
	private long eventId;
	@Column(name = "mapped_key")
	private String mappedKey;

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getMappedKey() {
		return mappedKey;
	}

	public void setMappedKey(String mappedKey) {
		this.mappedKey = mappedKey;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof LoggingEventPropertyId)) {
			return false;
		}
		LoggingEventPropertyId castOther = (LoggingEventPropertyId) other;
		return Objects.equals(eventId, castOther.eventId) && Objects.equals(mappedKey, castOther.mappedKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventId, mappedKey);
	}

}
