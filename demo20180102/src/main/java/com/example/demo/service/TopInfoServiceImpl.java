package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.TopInfo;
import com.example.demo.repository.TopInfoRepository;

@Service
@Transactional
public class TopInfoServiceImpl implements TopInfoService {
	
	@Autowired
	TopInfoRepository topInfoRepository;

	@Override
	public ArrayList<TopInfo> getTopInfos() {
		return topInfoRepository.getTopInfos();
	}

}
