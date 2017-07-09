import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
    
    //  TO CHECK WHETHER A FILE IS OPENED 
    //  OR NOT (not for .txt files)
    private boolean checkFileOpen()
    {
	    //  the file we want to check
    	boolean success = false;
	    String fileName = inputFile;
	    File file = new File(fileName);
	    // try to rename the file with the same name
	    File sameFileName = new File(fileName);
	    
	    if(file.renameTo(sameFileName)){
	        // if the file is renamed
	        System.out.println("file is closed");
	        success=true;
	    }else{
	        // if the file didnt accept the renaming operation
	        System.out.println("file is opened");
	        
	    }
	    return success;
    }

    public void write(int index) throws IOException, WriteException {
        File file = new File(inputFile);
        if(checkFileOpen())
        {
	        Workbook w;
	        try {
	        	w = Workbook.getWorkbook(file);
				//System.out.println(w.getSheet(0).getCell(0, 0).getContents());
				WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
		        WritableSheet excelSheet = aCopy.getSheet(0);
		        excelSheet.removeRow(index+1);
		        aCopy.write();
		        aCopy.close();
	        } catch (BiffException e) {
	            e.printStackTrace();
	        }
        }
        else
		{
			JOptionPane.showMessageDialog(null, 
					"Xin hãy đóng file nhanvien.xls",
                    "ALERT MESSAGE", 
                    JOptionPane.WARNING_MESSAGE);
		}
		
    }

    public void main(int index) throws IOException, WriteException {
    	delete_nhanvien test = new delete_nhanvien();
        test.setInputFile(System.getProperty("user.dir")+"/src/nhanvien.xls");
        test.write(index);
    }

}
