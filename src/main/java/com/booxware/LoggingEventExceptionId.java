package com.booxware;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LoggingEventExceptionId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private long eventId;
	@Column(name = "i")
	private long index;

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof LoggingEventExceptionId)) {
			return false;
		}
		LoggingEventExceptionId castOther = (LoggingEventExceptionId) other;
		return Objects.equals(eventId, castOther.eventId) && Objects.equals(index, castOther.index);
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventId, index);
	}

}
