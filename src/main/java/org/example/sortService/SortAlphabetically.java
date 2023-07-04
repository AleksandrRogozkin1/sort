package org.example.sortService;

import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabetically {
    public String sortAlphabetically(List<String> lines){
        List <String> sortedList=lines.stream().
                sorted()
                .collect(Collectors.toList());
        return sortedList.toString();
    }

}
