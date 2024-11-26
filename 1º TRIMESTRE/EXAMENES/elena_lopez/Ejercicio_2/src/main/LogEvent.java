package main;

import java.time.LocalDateTime;

public class LogEvent {
	private final LocalDateTime dateTime;
	private final String originalLine;
	
	public LogEvent(LocalDateTime _dateTime, String _originalLine) {
		this.dateTime = _dateTime;
		this.originalLine = _originalLine;
	}
	
	public LocalDateTime getDateTime() {
		return this.dateTime;
	}
	
	public String getOriginalLine() {
		return this.originalLine;
	}

}
