package com.lijiajun.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str=" ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str=" ";
		boolean b = StringUtil.hasText(str);
		System.out.println("不含空字符："+b);
	}

	@Test
	public void testRandomChineseString() {
		
		String c =StringUtil.randomChineseString();
		
		System.out.println(c);
	}

	@Test
	public void testGenerateChineseName() {
		
		String name = StringUtil.generateChineseName();
		
		System.out.println("姓名: "+name);
	}

	@Test
	public void testPhone(){
		boolean b = StringUtil.isPhone("13681230765");
		System.out.println("是否是手机号   "+b);
	}
	
	@Test
	public void testEMail(){
		boolean b = StringUtil.isEMail("631519824@qq.com");
		System.out.println("是否是邮箱   "+b);
	}
	
	@Test
	public void testNumber(){
		boolean b = StringUtil.isNumber("-123.a");
		System.out.println("是否是数字   "+b);
	}
	
	@Test
	public void testGetValue(){
		String value = StringUtil.getValue("八维教育学院",2);
		System.out.println(value);
	}
}
