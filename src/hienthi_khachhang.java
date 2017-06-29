import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class hienthi_khachhang {

    private String inputFile;
    private int lines;

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void read() throws IOException  {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
			w = Workbook.getWorkbook(inputWorkbook);
		    // Get the first sheet
		    Sheet sheet = w.getSheet(0);
		    // Số dòng
		    lines=sheet.getRows();
		    // Loop over column and lines
		    String ten[] = new String[lines];
		    String diachi[] = new String[lines];
		    String dienthoai[] = new String[lines];
		    String luuy[] = new String[lines];
		    for (int j = 0; j < sheet.getColumns(); j++) {
		        for (int i = 1; i < sheet.getRows(); i++) {
		            Cell cell = sheet.getCell(j, i);
		            CellType type = cell.getType();
		            if (type == CellType.LABEL) {
		                System.out.println("I got a label "
		                        + cell.getContents());
		            }
		        }
		        System.out.println("here0");
		        //ten[j]=sheet.getCell(j, 0).getContents();
		        //diachi[j]=sheet.getCell(j, 1).getContents();
		        //dienthoai[j]=sheet.getCell(j, 2).getContents();
		        //luuy[j]=sheet.getCell(j, 3).getContents();
		    }
		    System.out.println(lines);
		    System.out.println("here2");
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ReadExcel test = new ReadExcel();
        test.setInputFile(System.getProperty("user.dir")+"/lars.xls");
        test.read();
    }

}
