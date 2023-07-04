package org.example;

import org.example.sortService.SortAlphabetically;
import org.example.utils.FileReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> res=new FileReader("text").reading();
        String result=new SortAlphabetically().sortAlphabetically(res);
        System.out.println(result);
    }
}