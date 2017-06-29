import java.io.File;
import java.io.IOException;
import java.util.Locale;

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
    private int location_Row;

public void setOutputFile(String inputFile) {
    this.inputFile = inputFile;
    }

    public void write() throws IOException, WriteException {
		Workbook w;
		File file = new File(inputFile);
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
		    Gui g = new Gui();
		    for (int j = 1; j < lines; j++) {
	            Cell cell = sheet.getCell(0, j);
	            if (cell.getContents().equals(g.update_customer_name.getText()))
	            {
	            	location_Row=j;
	            }
	        }
		    WritableWorkbook aCopy = Workbook.createWorkbook(file, w);
	        WritableSheet excelSheet = aCopy.getSheet(0);
		    createContent(excelSheet,location_Row);
		    System.out.println(location_Row);
	        aCopy.write();
	        aCopy.close();
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}

    private void createContent(WritableSheet sheet, int lines) throws WriteException,
            RowsExceededException {
    	Gui g = new Gui();
         // Them dia chi
     	addLabel(sheet, 4, lines, g.update_customer_service.getText());
     	// Them so dien thoai
     	addLabel(sheet, 5, lines, g.update_customer_date.getText());
     	// Them luu y
     	addLabel(sheet, 6, lines, g.update_customer_payment.getText());
    }

    private void addLabel(WritableSheet sheet, int column, int row, String s)
            throws WriteException, RowsExceededException {
        Label label;
        System.out.println(column + " "+ row + " "+s);
        label = new Label(column, row, s);
        sheet.addCell(label);
    }

    public static void main(String[] args) throws WriteException, IOException {
        update_khachhang test = new update_khachhang();
        test.setOutputFile(System.getProperty("user.dir")+"/src/lars.xls");
        test.write();
        System.out
                .println("Please check the result file under [current directory]/src/lars.xls ");
    }
}

