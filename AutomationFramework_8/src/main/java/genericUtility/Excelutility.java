package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author shivagowri
 */
public class Excelutility {
	/**
	 * This method is used to read string data from the excel file
	 * 
	 * @param sheetname
	 * @param rowindex
	 * @param colindex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String Sheetname, int rowindex, int colindex)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/Testdata/Book.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		String value = workbook.getSheet(Sheetname).getRow(colindex).getCell(colindex).getStringCellValue();
		return value;

	}
	/**
	 * This method is used to read string data from the excel file
	 * @param Sheetname
	 * @param rowindex
	 * @param colindex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public Boolean getBoolean1(String Sheetname, int rowindex, int colindex)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/Testdata/Book.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		boolean value = workbook.getSheet(Sheetname).getRow(colindex).getCell(colindex).getBooleanCellValue();
		return value;

	}
	/**
	 * This method is used to read string data from the excel file
	 * @param Sheetname
	 * @param rowindex
	 * @param colindex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public double getNumeric(String Sheetname, int rowindex, int colindex)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/Testdata/Book.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		double value = workbook.getSheet(Sheetname).getRow(colindex).getCell(colindex).getNumericCellValue();
		return value;

	}
/**
 * This method is used to read string data from the excel file
 * @param Sheetname
 * @param rowindex
 * @param colindex
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public LocalDateTime getint(String Sheetname, int rowindex, int colindex)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/test/resources/Testdata/Book.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		LocalDateTime value = workbook.getSheet(Sheetname).getRow(colindex).getCell(colindex).getLocalDateTimeCellValue();
		return value;

	}

}
