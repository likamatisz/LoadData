package com.ic;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String fileName = "/Users/Irina/Downloads/Книга1.xls";


        try {
            LoadExcelData loader = new LoadExcelData(fileName);
            new WriteExcelToExcel(loader.getArray());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
