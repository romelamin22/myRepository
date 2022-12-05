package java_intermediate.excel_io;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelWithMultiDimArray {

    public static void main(String[] args) {

        String path = "C:\\Users\\PNT\\Documents\\Amin\\JAVA - OCT - 22\\Excel files\\data.xlsx";
        String mySheetPath = "Sheet1";

        try {

            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(mySheetPath);

            int myRow = sheet.getLastRowNum()+1;

            int myColumns = sheet.getRow(0).getLastCellNum();

            String [][] rowCol = new String[myRow][myColumns];

            for (int r = 0; r < myRow; r++){

                XSSFRow xRow = sheet.getRow(r);

                for (int c = 0; c < myColumns; c++){

                    String value = xRow.getCell(c).toString();

                    rowCol[r][c] = value;

                    System.out.print(rowCol[r][c] + "\t\t");

                }
                System.out.println();


            }

            workbook.close();
            fis.close();

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (IOException e) {

            System.out.println(e.getMessage());


        }




    }

}
