package com.booxware;

public class Address {

	private long eventId;
	private String address;

	public Address(long eventId, String address) {
		super();
		this.eventId = eventId;
		this.address = address;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
