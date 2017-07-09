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


public class add_khachhang {

    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private int lines=0;


    public void setOutputFile(String inputFile) {
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

    public void write(JTextField name,JTextField address,JTextField phone,JTextField note) throws IOException, WriteException {
        File file = new File(inputFile);
        
		if(file.exists() && !file.isDirectory()) { 
			if(checkFileOpen())
			{
				Workbook w;
				try {
					w = Workbook.getWorkbook(file);
					System.out.println(w.getSheet(0).getCell(0, 0).getContents());
					WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
			        WritableSheet excelSheet = aCopy.getSheet(0);
			        Sheet sh2 = aCopy.getSheet(0);
				    lines=sh2.getRows();
				    createContent(excelSheet,name, address, phone, note,lines);
				    /*
				    Gui g = new Gui();
				    // Them ho va ten
			    	excelSheet.addCell(new Label(0, lines, g.add_customer_name.getText()));
			        // Them dia chi
			    	excelSheet.addCell(new Label(1, lines, g.add_customer_address.getText()));
			    	// Them so dien thoai
			    	excelSheet.addCell(new Label(2, lines, g.add_customer_phoneNumber.getText()));
			    	// Them luu y
			    	excelSheet.addCell(new Label(3, lines, g.add_customer_note.getText()));
			    	*/
			        aCopy.write();
			        aCopy.close();
			        //w.close();
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
		else
		{
			WorkbookSettings wbSettings = new WorkbookSettings();
		    wbSettings.setLocale(new Locale("en", "EN"));
		    WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
		    workbook.createSheet("Report", 0);
		    WritableSheet excelSheet = workbook.getSheet(0);
		    createLabel(excelSheet);
		    lines=excelSheet.getRows();
		    createContent(excelSheet,name, address, phone, note,lines);
		    workbook.write();
		    workbook.close();
		}
    }

    private void createLabel(WritableSheet sheet)
            throws WriteException {
        // Lets create a times font
        WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
        // Define the cell format
        times = new WritableCellFormat(times10pt);
        // Lets automatically wrap the cells
        times.setWrap(true);

        // create create a bold font with unterlines
        WritableFont times10ptBoldUnderline = new WritableFont(
                WritableFont.TIMES, 10, WritableFont.BOLD, false,
                UnderlineStyle.SINGLE);
        timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
        // Lets automatically wrap the cells
        timesBoldUnderline.setWrap(true);

        CellView cv = new CellView();
        cv.setFormat(times);
        cv.setFormat(timesBoldUnderline);
        cv.setAutosize(true);

        // Write a few headers
        //JLabel name = Gui.lblHTh.getJLabel();
        addCaption(sheet, 0, 0, "Họ và Tên");
        addCaption(sheet, 1, 0, "Địa chỉ");
        addCaption(sheet, 2, 0, "Số điện thoại");
        addCaption(sheet, 3, 0, "Lưu ý");
        addCaption(sheet, 4, 0, "Dich Vu");
        addCaption(sheet, 5, 0, "Ngay");
        addCaption(sheet, 6, 0, "So Tien");


    }

    private void createContent(WritableSheet sheet, JTextField name,JTextField address,JTextField phone,JTextField note,  int lines) throws WriteException,
            RowsExceededException {
        // Them ho va ten
    	addLabel(sheet, 0, lines, name.getText());
        // Them dia chi
    	addLabel(sheet, 1, lines, address.getText());
    	// Them so dien thoai
    	addLabel(sheet, 2, lines, phone.getText());
    	// Them luu y
    	addLabel(sheet, 3, lines, note.getText());
    }

    private void addCaption(WritableSheet sheet, int column, int row, String s)
            throws RowsExceededException, WriteException {
        Label label;
        label = new Label(column, row, s, timesBoldUnderline);
        sheet.addCell(label);
    }

    private void addLabel(WritableSheet sheet, int column, int row, String s)
            throws WriteException, RowsExceededException {
        Label label;
        label = new Label(column, row, s);
        sheet.addCell(label);
    }

    public void main(JTextField name,JTextField address,JTextField phone,JTextField note) throws WriteException, IOException {
    	add_khachhang test = new add_khachhang();
        test.setOutputFile(System.getProperty("user.dir")+"/src/khachhang.xls");
        test.write(name, address, phone, note);
        System.out
                .println("Please check the result file under [current directory]/lars.xls ");
    }
}

