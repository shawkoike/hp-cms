package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.TopInfo;

public interface TopInfoService {
	
	/**
	 * シーケンス順に取得
	 */
	public ArrayList<TopInfo> getTopInfos();

}
