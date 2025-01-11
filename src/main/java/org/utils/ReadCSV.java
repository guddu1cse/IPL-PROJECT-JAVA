package org.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    public List<List<String>> readCSV(String fileName){
        ReadValues readValues = new ReadValues();
        String fullPath = "/Users/nami/IdeaProjects/IPL-PROJECT/src/main/java/org/data/" + fileName;
        String line = "";
        List<List<String>> csvList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
            while ((line = br.readLine()) != null) {
                List<String> values = readValues.readValues(line+", ,");
                csvList.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return csvList.subList(1 , csvList.size());
    }
}

