package Sel.day6;

public class PractiseReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String filename="C:\\Users\\BLTuser.BLT147\\Desktop\\1.xlsx";
        String sheetname="Sheet1";
        int r=0;
        int c=0;
        PractiseRead excel=new PractiseRead();
        String s=excel.read(filename,sheetname,r,c);
        System.out.println(s);
        }
	}
