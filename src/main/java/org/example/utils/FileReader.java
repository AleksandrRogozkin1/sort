package org.example.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private String sourceString;
    private List<String> stringFromFile=new ArrayList<>();

    public FileReader(String sourceString){
        this.sourceString=sourceString;
    }

    public List<String> reading(){
        if(sourceString!=null){
            try(InputStream fis=new FileInputStream(sourceString);
                Scanner scanner=new Scanner(fis)) {
                while (scanner.hasNext()){
                    stringFromFile.add(scanner.nextLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringFromFile;
    }
}