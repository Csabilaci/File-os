package hu.nive.ujratervezes.io.phonebook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {
    void exportPhonebook(Map<String, String> contacts, String output) {
        if(contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        File result = new File(output);
        try (FileWriter fileWriter = new FileWriter(result,true)){
            for (Map.Entry<String,String> input : contacts.entrySet()) {
                fileWriter.write(input.getKey()+": "+input.getValue() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}