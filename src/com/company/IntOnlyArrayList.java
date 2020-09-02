package com.company;

import java.util.Arrays;

public class IntOnlyArrayList {
    private int[] list;

    public IntOnlyArrayList() {
        list = new int[0];
    }

    public void add(int value){
        // Copy the existing array and make it 1 element larger. Then put value into last element in the array.
        int[] tempList = Arrays.copyOf(list, list.length+1);
        tempList[tempList.length - 1] = value;
        list = tempList;
    }

    public int get(int index){
        if (index < 0 || index > list.length - 1) {
            throw new IndexOutOfBoundsException("Number " + index + " is not a valid index");
        }
        return list[index];
    }

    public void remove(int index){
        // Make a copy of the array up to the index and a copy after the index.
        int[] tempList = Arrays.copyOfRange(list, 0, index);
        int[] tempList2 = Arrays.copyOfRange(list, index+1, list.length);
        // Add the arrays together.
        list = Arrays.copyOf(tempList, tempList.length + tempList2.length);
        System.arraycopy(tempList2, 0, list, tempList.length, tempList2.length);
    }

    public int size(){
        return list.length;
    }

    public void clear() {
        list = new int[0];
    }
}
