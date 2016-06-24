package com.itek.dashuai.bean;

public class GameNews {

	private int gameId; // ����ID
	private String newsTitle; // ���ű���
	private String newsAbstract;// ����ժҪ
	private String publishTime; // ���ŷ���ʱ��
	private String thumbImageUrl; // ��������ͼ
	private String newsBodyContent; // ����������������
	
	private int type = 1; // ��������
	
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
