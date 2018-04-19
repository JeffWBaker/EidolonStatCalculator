import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class stats {

	//private static int[][] statEligos = new int[5][60];// array of each stat 5 stats
													// and 60 levels
	private double evolve1_2 = 1.14776;// multiplicative increase of stats of
										// evolution from 1 to 2 stars
	private double emblem = .001;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println(setStatEligos());
/*
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("stat.xlsx"));
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(3);
		System.out.println(row.getCell(3).getNumericCellValue());
		workbook.close();
*/
	}
	public static  int[][] setStatEligos() throws FileNotFoundException, IOException{
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("stat2.xlsx"));//gets the excel file
		XSSFSheet sheet = workbook.getSheetAt(0);//gets the 1st sheet in excel file
		int[][] statEligos = new int[5][60];
		int data= 0;
		int countNull = 0;
		int count = 0;
		for(int row = 1; row < 5; row++){
			for(int col = 1; col < 57; col++){
				
				//XSSFRow rowExcel = sheet.getRow(row);
				if(sheet.getRow(row + 16).getCell(col) == null){
					//System.out.println("null");;
					countNull++;
				}
				else{
					data = (int) sheet.getRow(row + 16).getCell(col).getNumericCellValue();//loops through and gets date in each rox col
					statEligos[row-1][col-1]= 	 data;//sets into 2d array
					System.out.print(data + ",");	
					count++;
				}
				
			}
			//System.out.println("Count: " + count + " Null: " + countNull);
		}
		workbook.close();
		return statEligos;
	}
	
	
}
