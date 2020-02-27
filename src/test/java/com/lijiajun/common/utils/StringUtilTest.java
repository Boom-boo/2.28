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

}
