package com.itek.dashuai.bean;

public class GameNews {

	private int gameId; // 新闻ID
	private String newsTitle; // 新闻标题
	private String newsAbstract;// 新闻摘要
	private String publishTime; // 新闻发布时间
	private String thumbImageUrl; // 新闻缩略图
	private String newsBodyContent; // 新闻详情主体内容
	
	private int type = 1; // 新闻类型
	
	public int getGameId() {
		return gameId;
	}
	
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsAbstract() {
		return newsAbstract;
	}

	public void setNewsAbstract(String newsAbstract) {
		this.newsAbstract = newsAbstract;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getThumbImageUrl() {
		return thumbImageUrl;
	}

	public void setThumbImageUrl(String thumbImageUrl) {
		this.thumbImageUrl = thumbImageUrl;
	}

	public String getNewsBodyContent() {
		return newsBodyContent;
	}

	public void setNewsBodyContent(String newsBodyContent) {
		this.newsBodyContent = newsBodyContent;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "GameNews [gameId=" + gameId + ", newsTitle=" + newsTitle + ", newsAbstract=" + newsAbstract
				+ ", publishTime=" + publishTime + ", thumbImageUrl=" + thumbImageUrl + ", newsBodyContent="
				+ newsBodyContent + ", type=" + type+"]";
	}

}
