package com.booxware;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LoggingEventRepository extends CrudRepository<LoggingEvent, Long> {
	
	List<LoggingEvent> findByEventId(Long eventId);

}
