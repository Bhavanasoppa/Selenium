package Sel.day5;

public class main_excel_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="C:\\Users\\BLTuser.BLT147\\Desktop\\1.xlsx";
		String sheetname="Sheet1";
		int r=0;
		int c=0;
		WriteExcel excel=new WriteExcel ();
		//String s=excel.read_excel(filename,sheetname,r,c);
		//System.out.println(s);
		
		c=1;
		excel.write_excel(filename,sheetname,r,c,"Hello");
	}

}
