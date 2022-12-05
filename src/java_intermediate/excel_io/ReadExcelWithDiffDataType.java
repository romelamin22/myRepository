package java_intermediate.excel_io;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelWithDiffDataType {

    public static void main(String[] args) {
        String path = "C:\\Users\\PNT\\Documents\\Amin\\JAVA - OCT - 22\\Excel files\\data.xlsx";
        String mySheetPath = "Sheet1";

        try {

            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(mySheetPath);

            int myRow = sheet.getLastRowNum()+1;
            int myCol = sheet.getRow(0).getLastCellNum();

            for (int r = 0; r < myRow; r++){


                XSSFRow readRow = sheet.getRow(r);

                for (int c = 0; c < myCol; c++){

                    //String value = readRow.getCell(c).toString();

                    XSSFCell readCell = readRow.getCell(c);

                    switch (readCell.getCellType()){

                        case STRING:
                            System.out.print(readCell.getStringCellValue() + "\t\t");
                            break;

                        case NUMERIC:
                            System.out.print(readCell.getNumericCellValue() + "\t\t");
                            break;

                        case BOOLEAN:
                            System.out.print(readCell.getBooleanCellValue() + "\t\t");
                            break;
                        default:
                            System.out.println("Value is not readable");
                    }


                }
                System.out.println();


            }



        }catch (IOException e){

            System.out.println(e.getMessage());

        }
    }

}
