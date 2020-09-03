package com.company;

import java.util.Arrays;

public class IntOnlyArrayList {

    private int[] list;

    public IntOnlyArrayList() {
        list = new int[0];
    }

    public void add(int value){
        // Copy the existing array and make it 1 element larger. Then put new value into array's last element.
        int[] tempList = Arrays.copyOf(list, list.length+1);
        tempList[tempList.length - 1] = value;
        list = tempList;
    }

    public void addAll(IntOnlyArrayList otherobject){
        // Make existing array large enough to accommodate 2nd array and then copy it over into it.
        int[] otherList = otherobject.getList();
        list = Arrays.copyOf(list, list.length + otherList.length);
        System.arraycopy(otherList, 0, list, list.length-otherList.length, otherList.length);
    }

    public int get(int index){
        // Throw exception if user requests an index that is too low or too high.
        if (index < 0 || index > list.length - 1) {
            throw new IndexOutOfBoundsException("Number " + index + " is not a valid index");
        }
        return list[index];
    }

    public void remove(int index){
        // Throw exception if user requests an index that is too low or too high.
        if (index < 0 || index > list.length - 1) {
            throw new IndexOutOfBoundsException("Number " + index + " is not a valid index");
        }
        // Make a copy of the array up to the index and a copy after the index.
        int[] tempList = Arrays.copyOfRange(list, 0, index);
        int[] tempList2 = Arrays.copyOfRange(list, index+1, list.length);
        // Add the arrays together.
        list = Arrays.copyOf(tempList, tempList.length + tempList2.length);
        System.arraycopy(tempList2, 0, list, tempList.length, tempList2.length);
    }

    public boolean contains(int number) {
        // Return true if specified value exists in array. Otherwise false.
        for (int i : list) {
            if (i==number) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int number) {
        // Find the index of the first occurence of a specified value. If not in array, return -1.
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int size(){
        // Returns the size/length of the array.
        return list.length;
    }

    public void clear() {
        // Reset array back to 0 elements.
        list = new int[0];
    }

    public int[] getList() {
        return this.list;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
