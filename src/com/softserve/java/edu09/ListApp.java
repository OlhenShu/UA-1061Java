package com.softserve.java.edu09;

import java.util.ArrayList;
import java.util.*;

public class ListApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("AAA");
        list.add("ABC");
        list.add("ACD");
        list.add("AFD");
        list.add(1,"AAA");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove("AAA");
        String value = list.get(1);
        int index = list.indexOf("AFD");

        boolean exist = list.contains("AAA");

        int size = list.size();

        list.clear();
        boolean isEmpty = list.isEmpty();
        System.out.println(value);
        System.out.println(index);
        System.out.println(exist);
        System.out.println(size);
        System.out.println(isEmpty);
    }
}
