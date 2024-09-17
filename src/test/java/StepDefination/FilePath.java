package StepDefination;

public interface FilePath {

	String FILE_PATH="D:\\Admin\\Admin_Console.xlsx";
	Xls_AllMethods excel = new Xls_AllMethods(FILE_PATH);
	
	String HELP_SHEETNAME = "Admin";
}
