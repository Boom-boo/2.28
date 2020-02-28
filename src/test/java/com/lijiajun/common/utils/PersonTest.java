package com.lijiajun.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test1() {

		for (int i = 0; i <100; i++) {
			Person p = new Person();
			// 调用创建姓名
			p.setName(StringUtil.generateChineseName());
			// 年龄
			p.setAge(RandomUtil.random(1, 120));
			// 随机汉字
			p.setAbout(StringUtil.randomChineseString(140));
			// 模拟2010-01-01至今随意时间随机时间
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			p.setCreated(DateUtils.randomDate(c.getTime(), new Date()));
			System.out.println(p);
		}
	}
}
