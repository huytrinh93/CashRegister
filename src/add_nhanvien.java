import java.io.File;
import java.io.IOException;
import java.util.Locale;

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


public class add_nhanvien {

    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private int lines=0;


    public void setOutputFile(String inputFile) {
	    this.inputFile = inputFile;
    }

    public void write(JTextField name,JTextField money_ratio,JTextField cash_ratio) throws IOException, WriteException {
        File file = new File(inputFile);
        
		if(file.exists() && !file.isDirectory()) { 
			System.out.println("here");
			Workbook w;
			try {
				w = Workbook.getWorkbook(file);
				System.out.println(w.getSheet(0).getCell(0, 0).getContents());
				WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
		        WritableSheet excelSheet = aCopy.getSheet(0);
		        Sheet sh2 = aCopy.getSheet(0);
			    lines=sh2.getRows();
			    createContent(excelSheet,name, money_ratio, cash_ratio,lines);
		        aCopy.write();
		        aCopy.close();
		        //w.close();
			} catch (BiffException e) {
				e.printStackTrace();
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
		    createContent(excelSheet,name, money_ratio, cash_ratio,lines);
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
        addCaption(sheet, 0, 0, "Tên");
        addCaption(sheet, 1, 0, "Tỷ lệ chia tiền");
        addCaption(sheet, 2, 0, "Tỷ lệ cash");
        //addCaption(sheet, 3, 0, "Lưu ý");
        //addCaption(sheet, 4, 0, "Dich Vu");
        //addCaption(sheet, 5, 0, "Ngay");
        //addCaption(sheet, 6, 0, "So Tien");


    }

    private void createContent(WritableSheet sheet, JTextField name,JTextField money_ratio,JTextField cash_ratio,  int lines) throws WriteException,
            RowsExceededException {
        Gui g = new Gui();
        // Them ho va ten
    	addLabel(sheet, 0, lines, name.getText());
        // Them dia chi
    	addLabel(sheet, 1, lines, money_ratio.getText());
    	// Them so dien thoai
    	addLabel(sheet, 2, lines, cash_ratio.getText());
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

    public void main(JTextField name,JTextField money_ratio,JTextField cash_ratio) throws WriteException, IOException {
    	add_nhanvien test = new add_nhanvien();
        test.setOutputFile(System.getProperty("user.dir")+"/src/nhanvien.xls");
        test.write(name, money_ratio, cash_ratio);
        System.out
                .println("Please check the result file under [current directory]/lars.xls ");
    }
}

