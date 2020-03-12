package Sel.day6;

public class PractiseWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="C:\\Users\\BLTuser.BLT147\\Desktop\\1.xlsx";
        String sheetname="Sheet1";
        int r=0;
        int c=0;
        PractiseWrite excel=new PractiseWrite();
        c=2;
        excel.write(filename, sheetname, r, c, "Bhavana");
	}

}
