package com.big.to.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dogu{
	
	public static String strForm(Date d) {
		DateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
		Date nowDate = new Date();
		String strDate = sdFormat.format(nowDate);
		return strDate;
	}
}
