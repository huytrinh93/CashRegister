import java.io.File;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class hienthi_khachhang {

    private String inputFile;
    private int lines;
    public String name = "";

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void read(String tmp, JTextArea field) throws IOException  {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
			w = Workbook.getWorkbook(inputWorkbook);
		    // Get the first sheet
		    Sheet sheet = w.getSheet(0);
		    // Số dòng
		    lines=sheet.getRows();
		    // Loop over column and lines
		    //String ten[] = new String[lines];
		    //String diachi[] = new String[lines];
		    //String dienthoai[] = new String[lines];
		    //String luuy[] = new String[lines];
		    for (int j = 1; j < lines; j++) {
	            Cell cell = sheet.getCell(0, j);
	            System.out.println("ten ++ "+tmp);
	            
	            if (cell.getContents().equals(tmp))
	            {
	            	field.setText("Ten: "+ sheet.getCell(0, j).getContents() + "\nDia chi: "+ sheet.getCell(1, j).getContents()+"\nDien thoai: "+ sheet.getCell(2, j).getContents()+"\nLuu y: "+ sheet.getCell(3, j).getContents());
	            }
	        }
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public void main(String tmp, JTextArea field) throws IOException {
        hienthi_khachhang test = new hienthi_khachhang();
        test.setInputFile(System.getProperty("user.dir")+"/src/khachhang.xls");
        test.read(tmp,field);
    }

}
