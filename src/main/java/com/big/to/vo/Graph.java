package com.big.to.vo;

import java.util.Date;

public class Graph {
	
	private int id;
	
	// 선택
	private String krname;
	private String gb;
	private Date startDate;
	private Date endDate;
	
	// 그래프
	private Date postdate;
	private int soldprice;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKrname() {
		return krname;
	}
	public void setKrname(String krname) {
		this.krname = krname;
	}
	public String getGb() {
		return gb;
	}
	public void setGb(String gb) {
		this.gb = gb;
	}
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public int getSoldprice() {
		return soldprice;
	}
	public void setSoldprice(int soldprice) {
		this.soldprice = soldprice;
	}
		
}
