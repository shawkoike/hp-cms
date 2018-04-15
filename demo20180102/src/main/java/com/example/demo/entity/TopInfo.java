package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "top_info")
public class TopInfo {
	
	// シーケンス
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "sequence")
	private int sequence;
	
	// 表示タイトル
	@Column(name = "title")
	private String title;
	
	// url
	@Column(name = "url")
	private String url;
	
	// 更新日
	@Column(name = "update_date")
	private String updateDate;

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
