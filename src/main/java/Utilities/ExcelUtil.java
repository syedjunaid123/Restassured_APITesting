package Utilities;


import java.io.IOException;
import java.util.Random;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
//	static XSSFWorkbook workbook;
//	static XSSFSheet sheet;
//	
//	static String projectPath = System.getProperty("user.dir");
//	static String excelPath = projectPath+"/src/test/resources/Employee_Id_data.xlsx";
//	
//	public ExcelUtil(){
//		try {
//			workbook = new XSSFWorkbook(excelPath);
//			sheet = workbook.getSheet("employees_id's");
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//	
//	public static void getData() {
//		Random random_employee = new Random(); 
//		int random_employee_id = random_employee.nextInt(24) + 1;
//		int employee_id = (int)sheet.getRow(random_employee_id).getCell(0).getNumericCellValue();
//		System.out.println(random_employee_id);
//		System.out.println(employee_id);
//	}
//	
	
	
	public static void getCellValue() {
		try {
			Random random_employee = new Random(); 
			String projectPath = System.getProperty("user.dir");
			String excelPath = projectPath+"/src/test/resources/Employee_Id_data.xlsx";

			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("employees_id's");
			
			int random_employee_id = random_employee.nextInt(24) + 1;
			int employee_id = (int)sheet.getRow(random_employee_id).getCell(0).getNumericCellValue();
			System.out.println(random_employee_id);
			System.out.println(employee_id);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return;

	}
	public static void main(String[] args) {
		getCellValue();
		
	}
}
