package com.big.to.vo;

import java.util.Date;

//CREATE TABLE `info` (
//		`model` VARCHAR(10) NULL DEFAULT NULL,
//		`krname` VARCHAR(10) NULL DEFAULT NULL,
//		`gb` VARCHAR(10) NULL DEFAULT NULL,
//		`reldate` DATE NULL DEFAULT NULL,
//		`relprice` INT(11) NULL DEFAULT NULL,
//		`disdate` DATE NULL DEFAULT NULL
//	)
public class InfoIphone {
	private String model;
	private String krname;
	private String gb;
	private Date reldate;
	private int relprice;
	private Date disdate;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public Date getReldate() {
		return reldate;
	}
	public void setReldate(Date reldate) {
		this.reldate = reldate;
	}
	public int getRelprice() {
		return relprice;
	}
	public void setRelprice(int relprice) {
		this.relprice = relprice;
	}
	public Date getDisdate() {
		return disdate;
	}
	public void setDisdate(Date disdate) {
		this.disdate = disdate;
	}
	
}
