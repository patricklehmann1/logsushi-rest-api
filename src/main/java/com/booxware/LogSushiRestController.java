package com.booxware;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogSushiRestController {
	
	@Autowired
	private LoggingEventRepository loggingEventRepo;  
	
    @RequestMapping("/hello")
    public List<LoggingEvent> home() {
    	return loggingEventRepo.findByEventId(1L);
    }


}
