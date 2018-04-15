package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.LiveEntity;

public interface LiveService {
	
	/**
	 * イベント開催日昇順に全件取得
	 */
	public ArrayList<LiveEntity> getEvents();

}
