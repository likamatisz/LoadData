package com.ic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String fileName = "";

        try {
            Files.newDirectoryStream(Paths.get("C:\\excel"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            LoadExcelData loader = new LoadExcelData(fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
