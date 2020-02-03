package com.ic;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class WriteExcelToExcel {
    public WriteExcelToExcel(ArrayList arrayList) throws FileNotFoundException {
        FileOutputStream stream = new FileOutputStream(new File("outFile.xls"));
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet();
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < arrayList.size(); i++) {
            row.createCell(i).setCellValue(String.valueOf(arrayList.get(i)));
        }
    }
}
