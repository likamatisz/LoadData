package com.ic;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LoadExcelData {
    private ArrayList<String> arrayCells;

    public LoadExcelData(String fileName) throws IOException {
        HSSFWorkbook workBook = new HSSFWorkbook(new FileInputStream(fileName));
        HSSFSheet sheet = workBook.getSheetAt(0);
        arrayCells = new ArrayList<>();
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
                arrayCells.add(String.valueOf(sheet.getRow(i).getCell(j)));
            }
        }
    }

    public ArrayList<String> getArrayCells() {
        return arrayCells;
    }
}
