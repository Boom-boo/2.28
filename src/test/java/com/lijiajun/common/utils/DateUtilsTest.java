package com.lijiajun.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testRandomDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010,0,1);//为日类设置
		Date date = DateUtils.randomDate(c.getTime(),new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
	}
	//月初
	@Test
	public void testInitMonth() {
		
		Date date = DateUtils.getInitMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
	}
	//月末
	@Test
	public void testEndMonth(){
		Date date = DateUtils.getEndMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	} 
}
