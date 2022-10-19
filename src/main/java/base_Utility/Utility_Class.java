package base_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {
	WebDriver driver;
	public Utility_Class( WebDriver _driver) {
		
		driver = _driver;
	}

	public String Get_Excel_Data(int Rowid, int Cellid) throws EncryptedDocumentException, IOException {
		
		FileInputStream File= new FileInputStream("\\Automation\\FaceBook.xlsx");
		org.apache.poi.ss.usermodel.Sheet sheet = WorkbookFactory.create(File).getSheet("FB");
		Cell cell = sheet.getRow(Rowid).getCell(Cellid);
		
		try {
			return cell.getStringCellValue();
		} catch (Exception e) {
			return cell.getNumericCellValue()+"";
		}
	}
	public void TakeScreenShot(String TC_Name) throws IOException {
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("G:\\Automation\\Test_Outputs\\"+TC_Name+".png");
	FileHandler.copy(src, dest);
}
}
