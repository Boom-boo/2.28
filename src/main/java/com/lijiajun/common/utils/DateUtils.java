package com.lijiajun.common.utils;
/**
 * 
 * @ClassName: DateUtils 
 * @Description: 日期工具类
 * @author: aaa
 * @date: 2020年2月28日 下午4:11:23
 */

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param min 最小日期
	 * @param max 最大日期
	 * @return 在min和max之间的随机日期
	 * @return: Date
	 */
	public static Date randomDate(Date min,Date max) {
		//最小日期的毫米数,从1970到min毫秒数
		long t1= min.getTime();
		long t2= max.getTime();
		
		if(t1>t2) return null;
		
		double d = Math.random();//返回0-1之间的值
		
		long x=(long)(d*(t2-t1+1)+t1);
		
		return new Date(x);
	}
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description:返回指定日期的月初,比如2020-02-28,返回2020-02-01
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		
		//获取一个日历类
		Calendar c = Calendar.getInstance();//获取当前西戎时间的日历类
		//用传入的日期再初始化日历类
		c.setTime(date);
		//调用日历类的相关方法
		c.set(Calendar.DAY_OF_MONTH,1);
		c.set(Calendar.HOUR_OF_DAY,0);//小时
		c.set(Calendar.MINUTE,0);//分钟
		c.set(Calendar.SECOND,0);//秒
		
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回指定日期的月末,比如2020-02-28,返回2020-02-29
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date){
		//获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//整体让月份+1,在变成月初-1秒
		c.add(Calendar.MONTH,1);
		Date initMonth = getInitMonth(c.getTime());//让月份+1
		c.setTime(initMonth);//变成月初
		c.add(Calendar.SECOND,-1);//减去1秒
		return c.getTime();
	}
}
