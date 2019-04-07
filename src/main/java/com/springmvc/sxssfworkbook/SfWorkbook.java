package com.springmvc.sxssfworkbook;

import java.io.IOException;

public class SfWorkbook {
	public static void main(String[] args) throws IOException {
		long beginTime = System.currentTimeMillis();
		String path = "F:\\test.xlsx";
		Excel2007.Excel2007AboveOperate(path);
		long endTime = System.currentTimeMillis();

		System.out.println("Cast time : " + (endTime - beginTime));
	}
}
