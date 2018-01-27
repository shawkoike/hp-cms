package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="live")
public class LiveEntity {
 
	// シーケンス
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column
	private int sequence;
	
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
	
	// 表示フラグ
	@Column
	private int print;
	
	// 優先
	@Column
	private int priority;

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

	public int getPrint() {
		return print;
	}

	public void setPrint(int print) {
		this.print = print;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

/**
 * コンストラクタ
 */
 public LiveEntity(){

 }

public int getSequence() {
	return sequence;
}

public void setSequence(int sequence) {
	this.sequence = sequence;
}


}
