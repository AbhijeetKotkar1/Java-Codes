package com.company;

import java.io.*;
import com.opencsv.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("test.csv");
        OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
        CSVWriter csvWriter = new CSVWriter(osw);
        long i = 0;
        for(i = 0; i <= Long.parseLong("1000000000"); i++){
            String row[] = {String.valueOf(i), "Community"};
            csvWriter.writeNext(row);
        }
        csvWriter.close();
        osw.close();
        out.close();
    }
}
