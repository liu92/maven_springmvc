package com.springmvc.sxssfworkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * <p>
 * Title:Excel2007
 * </p>
 * 
 * @author liuwanlin
 * @date 2017年1月22日上午11:03:00
 */
public class Excel2007 {

	@SuppressWarnings("resource")
	public static void Excel2007AboveOperate(String filePath)
			throws IOException {
		XSSFWorkbook workbook1 = new XSSFWorkbook(new FileInputStream(new File(
				filePath)));
		SXSSFWorkbook sxssfWorkbook = new SXSSFWorkbook(workbook1, 100);

		Sheet first = sxssfWorkbook.getSheetAt(0);
		for (int i = 0; i < 100000; i++) {
			Row row = first.createRow(i);
			for (int j = 0; j < 11; j++) {
				if (i == 0) {
					//
					row.createCell(j).setCellValue("column" + j);
				} else {
					//
					if (j == 0) {
						CellUtil.createCell(row, j, String.valueOf(i));
					} else
						CellUtil.createCell(row, j,
								String.valueOf(Math.random()));
				}
			}
		}
		FileOutputStream out = new FileOutputStream(filePath);
		sxssfWorkbook.write(out);
		out.close();
	}

}
