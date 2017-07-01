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

public class hienthi_nhanvien {

    private String inputFile;
    private int lines;
    public String name = "";

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public DefaultListModel read() throws IOException  {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        DefaultListModel<String> listModel = new DefaultListModel();
        try {
			w = Workbook.getWorkbook(inputWorkbook);
		    // Get the first sheet
		    Sheet sheet = w.getSheet(0);
		    // Số dòng
		    lines=sheet.getRows();
		    System.out.println("here1");
	        
		    // Loop over column and lines
		    for (int j = 1; j < lines; j++) {
	            //Cell cell = sheet.getCell(0, j);
	            System.out.println(sheet.getCell(0, j).getContents());
	            listModel.addElement(sheet.getCell(0, j).getContents() );
	        }
        } catch (BiffException e) {
            e.printStackTrace();
        }
		return listModel;
    }

    public DefaultListModel main() throws IOException {
    	hienthi_nhanvien test = new hienthi_nhanvien();
        test.setInputFile(System.getProperty("user.dir")+"/src/nhanvien.xls");
        DefaultListModel listModel = test.read();
        return listModel;
    }

}
