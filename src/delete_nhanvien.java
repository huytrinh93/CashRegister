import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class delete_nhanvien {

    private String inputFile;
    private int lines;
    public String name = "";

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void write(int index) throws IOException, WriteException {
        File file = new File(inputFile);
        Workbook w;
        try {
        	w = Workbook.getWorkbook(file);
			System.out.println(w.getSheet(0).getCell(0, 0).getContents());
			WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
	        WritableSheet excelSheet = aCopy.getSheet(0);
	        excelSheet.removeRow(index+1);
	        aCopy.write();
	        aCopy.close();
        } catch (BiffException e) {
            e.printStackTrace();
        }
		
    }

    public void main(int index) throws IOException, WriteException {
    	delete_nhanvien test = new delete_nhanvien();
        test.setInputFile(System.getProperty("user.dir")+"/src/nhanvien.xls");
        test.write(index);
    }

}
