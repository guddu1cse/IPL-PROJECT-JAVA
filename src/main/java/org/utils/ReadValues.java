package org.utils;

import java.util.ArrayList;
import java.util.List;

public class ReadValues {

    public List<String> readValues(String record){
        List<String> values = new ArrayList<>();

        String value = "";
        boolean inQuate = false;
        for(int y=0 ; y<record.length() ; y++){
            char c= record.charAt(y);
            if(c == '"'){
                inQuate = !inQuate;
            } else if(inQuate && c==','){
                value+=',';
            } else if(c==','){
                values.add(value);
                value = "";
            } else value+=c;
        }
        return values;
    }
}
