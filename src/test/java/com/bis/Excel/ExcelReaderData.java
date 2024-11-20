package com.bis.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReaderData {
		private static XSSFWorkbook workbook;
	    private static XSSFSheet sheet;
		 public static void setExcelFile(String excelFilePath, String sheetName) {
			 try {
		            File file = new File(excelFilePath);
		            FileInputStream inputStream = new FileInputStream(file);
		            workbook = new XSSFWorkbook(inputStream);
		            sheet = workbook.getSheet(sheetName);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

		    public static String getCellData(int rowNum, int colNum) {
		        XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
		        return cell.getStringCellValue();
		    }

			public static int getRowCountInSheet() {
				// TODO Auto-generated method stub
				int sheetCount=sheet.getLastRowNum();
				return sheetCount ;
			}
		}
