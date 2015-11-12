package com.booxware;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoggingEventRepository extends CrudRepository<LoggingEvent, Long> {
	
	List<LoggingEvent> findByEventId(Long eventId);
	
	@Query(value="from LoggingEvent l where l.timestmp > ?1")
	List<LoggingEvent> findEventsSinceTimestamp(long timeStamp);

	@Query(value="select new com.booxware.Address(prop.id.eventId, prop.mappedValue) from LoggingEventProperty prop where prop.id.mappedKey = 'ADDRESS'")
	List<Address> findAllAddresses();

}
