package com.company;

public class Main {

    public static void main(String[] args) {

        IntOnlyArrayList myArrayList = new IntOnlyArrayList();
        myArrayList.add(5);
        myArrayList.add(10);
        myArrayList.add(32);
        myArrayList.add(8);
        myArrayList.add(55);
        myArrayList.add(42);
        myArrayList.add(89);

        IntOnlyArrayList myArrayList2 = new IntOnlyArrayList();
        myArrayList2.add(-3);
        myArrayList2.add(-13);
        myArrayList2.add(-22);
        myArrayList2.add(-105);
        myArrayList2.add(-8);

        System.out.println(myArrayList);;
        System.out.println(myArrayList2);;

        myArrayList.addAll(myArrayList2);
        System.out.println(myArrayList);

        System.out.println("The arraylist contains the number -22: " + myArrayList.contains(-22));
        System.out.println("The index of value 89 is: " + myArrayList.indexOf(89));

        myArrayList.add(11, 999);
        System.out.println("The value of index 11 is: " + myArrayList.get(11));

        System.out.println("The size of the arraylist is: " + myArrayList.size());
        myArrayList.remove(6);
        System.out.println("The size of the after removal: " + myArrayList.size());

        myArrayList.clear();
        System.out.println("The arraylist after clearing: " + myArrayList);
    }
}
