//CREATE TABLE `total_iphone` (
//	`ID` BIGINT(20) NOT NULL,
//	`POSTDATE` DATE NULL DEFAULT NULL,
//	`MODEL` TEXT NULL,
//	`GB` TEXT NULL,
//	`KRNAME` TEXT NULL,
//	`SOLDPRICE` INT(11) NULL DEFAULT NULL,
//	`CONTRACT` TEXT NULL,
//	`AGENCY` TEXT NULL,
//	`GUARANTEE` TEXT NULL,
//	`CHANGES` TEXT NULL,
//	`CONDITIONS` TEXT NULL,
//	`COMPONENT` TEXT NULL,
//	`SOLD` TEXT NULL,
//	PRIMARY KEY (`ID`)
//)
package com.big.to.vo;

import java.util.Date;

public class TotalIphone {
	private int id;
	private Date postdate;
	private Date reldate;
	private Date disdate;
	private int dategap;
	private String model;
	private String gb;
	private String krname;
	private int soldprice;
	private int relprice;
	private Double soldrate;
	private String contract;
	private String agency;
	private String guarantee;
	private String changes;
	private String conditions;
	private String component;
	private String sold;
	// PostCount에 사용
	private int count;
	// FallPriceRate에 사용
	private double fallrate;
	//첫등록일, 마지막 등록일
	private Date start_date;
	private Date end_date;
	//판매량,등록양
	private int soldcount;
	private int regcount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public Date getReldate() {
		return reldate;
	}
	public void setReldate(Date reldate) {
		this.reldate = reldate;
	}
	public Date getDisdate() {
		return disdate;
	}
	public void setDisdate(Date disdate) {
		this.disdate = disdate;
	}
	public int getDategap() {
		return dategap;
	}
	public void setDategap(int dategap) {
		this.dategap = dategap;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getGb() {
		return gb;
	}
	public void setGb(String gb) {
		this.gb = gb;
	}
	public String getKrname() {
		return krname;
	}
	public void setKrname(String krname) {
		this.krname = krname;
	}
	public int getSoldprice() {
		return soldprice;
	}
	public void setSoldprice(int soldprice) {
		this.soldprice = soldprice;
	}
	public int getRelprice() {
		return relprice;
	}
	public void setRelprice(int relprice) {
		this.relprice = relprice;
	}
	public Double getSoldrate() {
		return soldrate;
	}
	public void setSoldrate(Double soldrate) {
		this.soldrate = soldrate;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	public String getChanges() {
		return changes;
	}
	public void setChanges(String changes) {
		this.changes = changes;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getSold() {
		return sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getFallrate() {
		return fallrate;
	}
	public void setFallrate(double fallrate) {
		this.fallrate = fallrate;
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
	public int getSoldcount() {
		return soldcount;
	}
	public void setSoldcount(int soldcount) {
		this.soldcount = soldcount;
	}
	public int getRegcount() {
		return regcount;
	}
	public void setRegcount(int regcount) {
		this.regcount = regcount;
	}


}
