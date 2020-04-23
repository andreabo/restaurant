package com.basic.utils;

import com.basic.models.kitchen.Ingredient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public List<String> readFile() {
        String path = "/Users/carol.bohorquez/Documents/programming basic/restaurant/src/resources/";
        String filename = "ingredientes.txt";
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path + "" + filename));
            String line;
            int i = 0;
            while (((line = br.readLine()) != null)) {
                i++;
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;

    }


}
