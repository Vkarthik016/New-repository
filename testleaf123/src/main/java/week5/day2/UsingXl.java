package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingXl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook("./testdata/testbook.xlsx");
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println("row count : "+rowcount);
		int cellcount = sheet.getRow(1).getLastCellNum();
	       System.out.println("total cells : "+cellcount);
	       for (int i = 1; i <=rowcount; i++) {
	    	   
	    	   for (int j = 0; j < cellcount; j++) {
				
	    		   String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
	    		   System.out.println(stringCellValue);


	}
	    	   wb.close();

}
	}
}
