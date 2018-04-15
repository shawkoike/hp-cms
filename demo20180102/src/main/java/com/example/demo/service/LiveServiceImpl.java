package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.LiveEntity;
import com.example.demo.repository.LiveRepository;

@Service
@Transactional
public class LiveServiceImpl implements LiveService {
	
	@Autowired
	LiveRepository liveRepository;

	@Override
	public ArrayList<LiveEntity> getEvents() {
		return liveRepository.getEvents();
	}

}
