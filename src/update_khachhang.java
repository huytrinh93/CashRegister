import java.io.File;
import java.io.IOException;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import jxl.Cell;
import jxl.CellType;
import jxl.CellView;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class update_khachhang {

    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private int lines;
    private int location_Row=0;
    

	public void setOutputFile(String inputFile) {
	    this.inputFile = inputFile;
	}

	//TO CHECK WHETHER A FILE IS OPENED 
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

    public void write(JTextField name,JTextField service,JTextField date,JTextField payment) throws IOException, WriteException {
		Workbook w;
		File file = new File(inputFile);
		if(checkFileOpen())
		{
			try{
				w = Workbook.getWorkbook(file);
			    // Get the first sheet
			    Sheet sheet = w.getSheet(0);
			    // Số dòng
			    lines=sheet.getRows();
			    // Loop over column and lines
			    String ten[] = new String[lines];
			    String diachi[] = new String[lines];
			    String dienthoai[] = new String[lines];
			    String luuy[] = new String[lines];
			    for (int j = 1; j < lines; j++) {
		            Cell cell = sheet.getCell(0, j);
		            System.out.println(cell.getContents()+ " "+name.getText());
		            if (cell.getContents().equals(name.getText()))
		            {
		            	location_Row=j;
		            	System.out.println(location_Row);
		    		    WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
		    	        WritableSheet excelSheet = aCopy.getSheet(0);
		    		    createContent(excelSheet,service,date,payment,location_Row);
		    	        aCopy.write();
		    	        aCopy.close();
		            }
		        }
			    
			} catch (BiffException e) {
				e.printStackTrace();
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, 
					"Xin hãy đóng file khachhang.xls",
                    "ALERT MESSAGE", 
                    JOptionPane.WARNING_MESSAGE);
		}
	}

    private void createContent(WritableSheet sheet,JTextField service,JTextField date,JTextField payment, int lines) throws WriteException,
            RowsExceededException {
         // Them dia chi
     	addLabel(sheet, 4, lines, service.getText());
     	// Them so dien thoai
     	addLabel(sheet, 5, lines, date.getText());
     	// Them luu y
     	addLabel(sheet, 6, lines, payment.getText());
    }

    private void addLabel(WritableSheet sheet, int column, int row, String s)
            throws WriteException, RowsExceededException {
        Label label;
        System.out.println(column + " "+ row + " "+s);
        label = new Label(column, row, s);
        sheet.addCell(label);
    }

    public void main(JTextField name,JTextField service,JTextField date,JTextField payment) throws WriteException, IOException {
        update_khachhang test = new update_khachhang();
        test.setOutputFile(System.getProperty("user.dir")+"/src/khachhang.xls");
        test.write(name, service,date,payment);
        System.out
                .println("Please check the result file under [current directory]/src/lars.xls ");
    }
}

