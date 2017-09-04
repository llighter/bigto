package com.big.to.vo;

import java.util.Date;

public class Graph {
	
	private int id;
	
	// 선택
	private String krname;
	private String gb;
	private Date start_date;
	private Date end_date;
	
	// 그래프
	private Date postdate;
	private int soldprice;
	
	private String krnamegb;
	
	private int soldcount;

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

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
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

	public String getKrnamegb() {
		return krnamegb;
	}

	public void setKrnamegb(String krnamegb) {
		this.krnamegb = krnamegb;
	}

	public int getSoldcount() {
		return soldcount;
	}

	public void setSoldcount(int soldcount) {
		this.soldcount = soldcount;
	}
	
}
