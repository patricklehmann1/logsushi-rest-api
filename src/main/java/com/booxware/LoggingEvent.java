package com.booxware;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoggingEvent {

	@Id
	private long eventId;

	@Column
	private long timestmp;

	@Column
	private String formattedMessage;

	@Column
	private String loggerName;

	@Column
	private String levelString;

	@Column
	private int referenceFlag;

	@Column
	private String arg0;

	@Column
	private String arg1;

	@Column
	private String arg2;

	@Column
	private String arg3;

	@Column
	private String callerFilename;

	@Column
	private String callerClass;

	@Column
	private String callerMethod;

	@Column
	private String callerLine;

	@OneToMany(mappedBy="id.eventId")
	private List<LoggingEventException> loggingEventExceptions;

	@OneToMany(mappedBy="id.eventId")
	private List<LoggingEventProperty> loggingEventProperties;

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public long getTimestmp() {
		return timestmp;
	}

	public void setTimestmp(long timestmp) {
		this.timestmp = timestmp;
	}

	public String getFormattedMessage() {
		return formattedMessage;
	}

	public void setFormattedMessage(String formattedMessage) {
		this.formattedMessage = formattedMessage;
	}

	public String getLoggerName() {
		return loggerName;
	}

	public void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}

	public String getLevelString() {
		return levelString;
	}

	public void setLevelString(String level) {
		this.levelString = level;
	}

	public int getReferenceFlag() {
		return referenceFlag;
	}

	public void setReferenceFlag(int referenceFlag) {
		this.referenceFlag = referenceFlag;
	}

	public String getArg0() {
		return arg0;
	}

	public void setArg0(String arg0) {
		this.arg0 = arg0;
	}

	public String getArg1() {
		return arg1;
	}

	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}

	public String getArg2() {
		return arg2;
	}

	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}

	public String getArg3() {
		return arg3;
	}

	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}

	public String getCallerFilename() {
		return callerFilename;
	}

	public void setCallerFilename(String callerFilename) {
		this.callerFilename = callerFilename;
	}

	public String getCallerClass() {
		return callerClass;
	}

	public void setCallerClass(String callerClass) {
		this.callerClass = callerClass;
	}

	public String getCallerMethod() {
		return callerMethod;
	}

	public void setCallerMethod(String callerMethod) {
		this.callerMethod = callerMethod;
	}

	public String getCallerLine() {
		return callerLine;
	}

	public void setCallerLine(String callerLine) {
		this.callerLine = callerLine;
	}

}
