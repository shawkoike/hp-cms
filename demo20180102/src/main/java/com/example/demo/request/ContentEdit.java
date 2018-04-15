package com.example.demo.request;

import javax.persistence.Column;

public class ContentEdit {
	
			// 件名
			private String title;
			
			// 本文
			private String content;
			
			// 日付
			private String date;
			
			// 場所
			private String place;
			
			// 開場時間
			private String open;
			
			// 開演
			private String start;
			
			// シーケンス
			private String sequence;

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

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	

		
	
}
