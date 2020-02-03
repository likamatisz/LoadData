package com.ic;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class WriteExcelToExcel {
    public WriteExcelToExcel(ArrayList<String[]> arrayList) throws FileNotFoundException {
        FileOutputStream stream = new FileOutputStream(new File("outFile.xls"));
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet();
        for (int i = 0; i < arrayList.size(); i++) {
            HSSFRow row = sheet.createRow(i);
            String[] arrayCells = new String[arrayList.get(i).length];
            arrayCells[i] = arrayList.get(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {

                row.createCell(j).setCellValue(String.valueOf(arrayCells[j]));
            }
        }
    }
}
