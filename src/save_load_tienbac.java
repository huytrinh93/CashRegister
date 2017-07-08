import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jxl.Cell;
import jxl.CellView;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class save_load_tienbac {
    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private int lines=0;


    public void setOutputFile(String inputFile) {
	    this.inputFile = inputFile;
    }
    
    public void read_all(String tmp, JTextArea field) throws IOException  {
    	File inputWorkbook = new File(System.getProperty("user.dir")+"/src/tienbac.xls");
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
	            if (cell.getContents().equals(tmp))
	            {
	            	field.setText("Ngày giờ: "+ sheet.getCell(0, j).getContents() + "\n Tên: "+ sheet.getCell(1, j).getContents()+"\nCash: "+ sheet.getCell(2, j).getContents()
	            			+"\nThẻ: "+ sheet.getCell(3, j).getContents()+"\nTip: "+ sheet.getCell(4, j).getContents());
	            }
	        }
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public void write(JLabel name,JTextField cash,JTextField the, JTextField tip) throws IOException, WriteException {
        File file = new File(System.getProperty("user.dir")+"/src/tienbac.xls");
        
		if(file.exists() && !file.isDirectory()) { 
			Workbook w;
			try {
				w = Workbook.getWorkbook(file);
				System.out.println(w.getSheet(0).getCell(0, 0).getContents());
				WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
		        WritableSheet excelSheet = aCopy.getSheet(0);
		        Sheet sh2 = aCopy.getSheet(0);
			    lines=sh2.getRows();
			    createContent(excelSheet,name, cash, the, tip ,lines);
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
		    createContent(excelSheet,name, cash, the, tip,lines);
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
        addCaption(sheet, 0, 0, "Ngày Giờ");
        addCaption(sheet, 1, 0, "Tên");
        addCaption(sheet, 2, 0, "Cash");
        addCaption(sheet, 3, 0, "Thẻ");
        addCaption(sheet, 4, 0, "Tip");
    }

    private void createContent(WritableSheet sheet, JLabel name,JTextField cash,JTextField the, JTextField tip,  int lines) throws WriteException,
            RowsExceededException {
        // Hien thi ngay thang nam
     	SimpleDateFormat ft = new SimpleDateFormat ("E MM/dd/yyyy 'at' hh:mm:ss a");
     	addLabel(sheet, 0, lines, ft.format(new Date()));
        // Them ho va ten
    	addLabel(sheet, 1, lines, name.getText());
        // Them cash
    	addLabel(sheet, 2, lines, cash.getText());
    	// Them the
    	addLabel(sheet, 3, lines, the.getText());
    	// Them tip
    	addLabel(sheet, 4, lines, tip.getText());
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
 /*   
    private void addNumber(WritableSheet sheet, int column, int row, Integer integer) throws WriteException, RowsExceededException {
        Number number;
        number = new Number(column, row, integer, times);
        sheet.addCell(number);
    }
*/
    public void main(JLabel name,JTextField cash,JTextField the,JTextField tip) throws WriteException, IOException {
    	save_load_tienbac test = new save_load_tienbac();
        test.setOutputFile(System.getProperty("user.dir")+"/src/tienbac.xls");
        test.write(name, cash, the, tip);
        System.out
                .println("Please check the result file under [current directory]/lars.xls ");
	    }
}
