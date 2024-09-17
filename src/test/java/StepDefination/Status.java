package StepDefination;

public class Status implements FilePath{
public static void storeStatus(String actual,String expected, String sheetName, int rownum ) {
	if (actual.equals(expected)) {
		System.out.println( excel.setCellData(sheetName, "Status", rownum, "Pass"));
	}else
		System.out.println(excel.setCellData(sheetName, "Status", rownum, "Fail"));
}
public static void storeStatusTrue(boolean condition, String sheetName, int rownum ) {
	if (condition) {
		 System.out.println(excel.setCellData(sheetName, "Status", rownum, "Pass"));
	}else
		System.out.println( excel.setCellData(sheetName, "Status", rownum, "Fail"));
}
public static void storeStatusFalse(boolean condition, String sheetName, int rownum ) {
	if (!condition) {
		System.out.println( excel.setCellData(sheetName, "Status", rownum, "Pass"));
	}else 
		System.out.println( excel.setCellData(sheetName, "Status", rownum, "Fail"));
	
}
}
