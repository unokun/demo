package com.example.demo.domain.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.repository.WhiteListsRepository;

@Service
public class WhiteListService {
	@Autowired
	private WhiteListsRepository repository;

	public WhiteListService() {
	}

	public Set<String> getWhiteLists() {
		List<String> whitelists = repository.findAll();

		Set<String> whiteset = new HashSet<>();
		whitelists.stream().forEach(ip -> whiteset.add(ip));
		return whiteset;
	}
}
