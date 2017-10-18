package com.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class Article {
	private int id, addtime,cid	,click	,isDelete	,isOriginal	,isShow	,isTop;	
	private String description,	title,	content,	author,	keywords;
	private List<Tag> tags;
	private Category category;
	private List<String> picAddress;

	public List<Tag> getTags() {
		if(tags == null){
			this.tags = new ArrayList<Tag>();
		}
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public List<String> getPicAddress() {
		return picAddress;
	}
	public void setPicAddress(List<String> picAddress) {
		this.picAddress = picAddress;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAddtime() {
		return addtime;
	}
	public void setAddtime(int addtime) {
		this.addtime = addtime;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public int getIsOriginal() {
		return isOriginal;
	}
	public void setIsOriginal(int isOriginal) {
		this.isOriginal = isOriginal;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public int getIsTop() {
		return isTop;
	}
	public void setIsTop(int isTop) {
		this.isTop = isTop;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}
