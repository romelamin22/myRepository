package java_intermediate.excel_io;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    public static void main(String[] args) throws IOException {
        //IO stands for Input and Output

        //created a string for the path location
        String path = "C:\\Users\\PNT\\Documents\\Amin\\JAVA - OCT - 22\\Excel files\\test.xlsx";

        //we are accessing the file with FileInputStream
        FileInputStream fis = new FileInputStream(path);

        //we are accessing the workbook of the file that we accessed
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        //we are accessing the sheet fo the workbook that we created access previously
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int row = sheet.getLastRowNum()+1;
        int column = sheet.getRow(0).getLastCellNum();

        for (int a = 0; a < row; a++){

            XSSFRow myRow = sheet.getRow(a);//assign all the row values inside this

            for (int b = 0; b < column; b++){

                String value = myRow.getCell(b).toString();//toString is a generic term we could use for integer, string, boolean, char etc.

                System.out.print(value + "\t\t");

            }


            System.out.println();

        }





    }


}
