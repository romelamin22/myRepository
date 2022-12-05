package java_intermediate.excel_io;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelWrite {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");



        Map<String, Object[]> data = new TreeMap<>();

        data.put("1", new Object[]{"ID", "Name", "States"});
        data.put("2", new Object[]{"100", "Raul", "NY"});
        data.put("3", new Object[]{"101", "Sarah", "NJ"});

        Set<String> keyid = data.keySet();

        int rowid = 0;

        for (String key:keyid){

            XSSFRow row = sheet.createRow(rowid++);

            Object[] objectArr = data.get(key);

            int cellid = 0;

            for (Object obj : objectArr){

                Cell cell = row.createCell(cellid++);

                cell.setCellValue((String)(obj));

            }

        }

        FileOutputStream out = new FileOutputStream
                ("C:\\Users\\PNT\\Documents\\Amin\\JAVA - OCT - 22\\Excel files\\output\\data.xlsx");

        workbook.write(out);

        out.close();


    }

}
