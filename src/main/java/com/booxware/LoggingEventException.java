package com.booxware;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class LoggingEventException {
	
	@EmbeddedId
	LoggingEventExceptionId id;

	@Column
	private String traceLine;

	public String getTraceLine() {
		return traceLine;
	}

	public void setTraceLine(String traceLine) {
		this.traceLine = traceLine;
	}

}
