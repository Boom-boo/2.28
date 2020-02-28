package com.lijiajun.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	//读取文件内容放入集合
	public static List<String> read(File file) throws IOException{
		//声明集合
		List<String> list=new ArrayList<String>();
		String sss="";
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";
		while((line=reader.readLine())!=null){
			list.add(line);
		}
		
		return list;
	}
}
