package Utilities;

import java.util.Random;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public int getCellValue() {
		
		int employee_id = 0;
		try {
			Random random_employee = new Random(); 
			String projectPath = System.getProperty("user.dir");
			String excelPath = projectPath+"/src/test/resources/Employee_Id_data.xlsx";

			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("employees_id's");
			
			int random_employee_id = random_employee.nextInt(24) + 1;
			employee_id = (int)sheet.getRow(random_employee_id).getCell(0).getNumericCellValue();


		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return employee_id;
	}

}
