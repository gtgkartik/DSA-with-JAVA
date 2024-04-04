package com.Arrays_and_ArrayLists;
import java.util.ArrayList ;
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(123);
        arr.add(32);
        arr.set(2,120);
        arr.contains(12);
        System.out.println(arr.size());
    }
}
