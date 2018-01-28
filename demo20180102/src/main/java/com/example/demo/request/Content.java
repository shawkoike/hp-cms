package com.example.demo.request;

import javax.persistence.Column;

public class Content {
	
	// 件名
			@Column
			private String title;
			
			// 本文
			@Column
			private String content;
			
			// 日付
			@Column
			private String date;
			
			// 場所
			@Column
			private String place;
			
			// 開場時間
			@Column
			private String open;
			
			// 開演
			@Column
			private String start;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

		
	
}
