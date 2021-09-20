package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperations {
	String filePath;
	Sheet sheetName;
	
	public ExcelOperations (String strSheetName)
	{
		try {
			filePath = System.getProperty("user.dir")+PropertyOperations.getPropertyValuebyKey("testDataLocation");
		} catch (Exception e) {
		e.printStackTrace();
		}
		File testDatafile = new File(filePath);
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(testDatafile);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		sheetName = wb.getSheet(strSheetName);
		//VehicleInsuranceData
	}
	
	public HashMap <String, String> getTestDatainHashMap(int RowNo) throws Exception	
	{
		
		HashMap<String, String> hashmap = new HashMap <String, String> ();
		for (int i =0; i<sheetName.getRow(0).getLastCellNum(); i++)
		{
			sheetName.getRow(RowNo).getCell(i).setCellType(CellType.STRING);
			hashmap.put(sheetName.getRow(0).getCell(i).toString(), sheetName.getRow(RowNo).getCell(i).toString());
		}
		
		return hashmap;
		
	}
	
//	public static void main (String [] args) throws Exception
//	{
//		ExcelOperations dataval = new ExcelOperations();
//		System.out.println("Test Data is "+dataval.getTestDatainHashMap(1));
//	}

	
	public int getRowCount()
	{
		return sheetName.getLastRowNum();
	}
	
	public int getColumnCount()
	{
		return sheetName.getRow(0).getLastCellNum();
	}
}
