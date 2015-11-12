package com.booxware;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LogSushiRestController {
	
	@Autowired
	private LoggingEventRepository loggingEventRepo;  
	
    @RequestMapping("/hello")
    public List<LoggingEvent> home() {
    	return loggingEventRepo.findByEventId(1L);
    }
    
    @RequestMapping("/loggingEvents24Hours")
    public List<LoggingEvent> getLoggingEventsFromLast24Hours() {
    	long onedayInMillis = TimeUnit.DAYS.toMillis(30);
    	long diff = new Date().getTime() - onedayInMillis;
    	System.out.println(diff);
    	return loggingEventRepo.findEventsSinceTimestamp(diff);
    }
    
    @RequestMapping("/allAddresses")
    public List<Address> getAllAddresses() {
    	return loggingEventRepo.findAllAddresses();
    }
    

}
