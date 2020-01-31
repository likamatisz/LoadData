package com.ic;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LoadExcelData {
    private HSSFWorkbook workBook;
    private HSSFSheet sheet;
    private String fileName;
    private ArrayList<String> arrayCells;

    public LoadExcelData(String fileName) throws IOException {
        this.fileName = fileName;
        workBook = new HSSFWorkbook(new FileInputStream(fileName));

    }
}
