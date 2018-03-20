package edu.javatutorials.javadevmustknow._01___JAVA_CORE._20_Collections._Collections_Class_methods.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_sort {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("bbb");
        cityList.add("ddd");
        cityList.add("fff");
        cityList.add("eee");
        cityList.add("aaa");


        print(cityList);

        System.out.println("\nCollection.sort() :\n");

        Collections.sort(cityList);

        print(cityList);
    }

    private static void print(List<String> cityList) {
        for(String city : cityList){
            System.out.println(city);
        }
    }
}
