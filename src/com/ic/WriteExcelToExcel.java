package com.ic;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.ArrayList;

public class WriteExcelToExcel {
    public WriteExcelToExcel(ArrayList<String[]> arrayList) throws IOException {
        FileOutputStream stream = new FileOutputStream(new File("outFile.xls"));
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet();
        HSSFRow row;
        for (int i = 0; i < arrayList.size(); i++) {
            row = sheet.createRow(i);
            String[] arrayCells = new String[arrayList.get(i).length];
            for (int y = 0; y < arrayCells.length; y++) {
                arrayCells[y] = arrayList.get(i)[y];
            }
            for (int j = 0; j < arrayCells.length; j++) {
                row.createCell(j).setCellValue(String.valueOf(arrayCells[j]));
            }
        }
        workBook.write(stream);
    }
}
