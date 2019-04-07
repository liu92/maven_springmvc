package com.springmvc.file;

/**
 * 获取文件路径
 * <p>
 * Title:FileName
 * </p>
 * 
 * @author liuwanlin
 * @date 2017年8月1日下午2:35:30
 */
public class FileName {

	public static void main(String[] args) {
		String fileName = "fdsaffwetry";
		int index = fileName.lastIndexOf("r");
		// lastIndexOf返回 String 对象中子字符串最后出现的位置
		System.out.println(index);// 9
		// indexOf方法 返回 String 对象内第一次出现子字符串的字符位置。
		int indext = fileName.indexOf("f");
		System.out.println(indext);// 0
	}

}
