package com.example.demo.task;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.domain.service.WhiteListService;
import com.example.demo.filter.AccessControl;

@Component
public class ScheduledTasks {
	@Autowired
	private WhiteListService service;

	@Autowired
	private AccessControl accessControl;

	@Scheduled(fixedDelay = 600000)
	public void updateWhiteList() {
		Set<String> whitelist = service.getWhiteLists();
		accessControl.setWhitelist(whitelist);
	}
}
