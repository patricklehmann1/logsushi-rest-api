package com.booxware;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class LoggingEventProperty {
	
	@EmbeddedId
	private LoggingEventPropertyId id;

	@Column
	private String mappedValue;

	public String getMappedValue() {
		return mappedValue;
	}

	public void setMappedValue(String mappedValue) {
		this.mappedValue = mappedValue;
	}

}
