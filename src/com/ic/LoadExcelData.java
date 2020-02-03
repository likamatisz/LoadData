package com.ic;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LoadExcelData {
    private ArrayList<String[]> array = new ArrayList<>();

    public LoadExcelData(String fileName) throws IOException {
        HSSFWorkbook workBook = new HSSFWorkbook(new FileInputStream(fileName));
        HSSFSheet sheet = workBook.getSheetAt(0);
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            String[] arrayCells = new String[sheet.getRow(i).getLastCellNum()];
            for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
                arrayCells[j] = (String.valueOf(sheet.getRow(i).getCell(j)));
            }
            array.add(arrayCells);
        }
    }

    public ArrayList<String[]> getArray() {
        return array;
    }
}
