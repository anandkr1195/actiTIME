package readData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadDataEXCEL 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		//create and read the excel file
		FileInputStream fis = new FileInputStream("./data/input.xlsx");
		//create workbook
		Workbook wb = WorkbookFactory.create(fis);
		//get the sheet
		Sheet sh = wb.getSheet("Sheet1");
		//get the rows
		Row r = sh.getRow(0);
		//get the cells	
		Cell c = r.getCell(0);
		//get the data
		String data = c.getStringCellValue();
		System.out.println(data);

	}
}
