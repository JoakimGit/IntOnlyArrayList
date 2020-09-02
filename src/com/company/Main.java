package com.company;

public class Main {

    public static void main(String[] args) {

        IntOnlyArrayList il = new IntOnlyArrayList();
        il.add(5);
        il.add(10);
        il.add(32);
        il.add(8);
        il.add(55);
        il.add(42);
        il.add(89);
        il.add(3);
        il.add(0);

        System.out.println(il.get(1));
        System.out.println(il.size());
        print(il);
        System.out.println(il.get(6));
        il.remove(6);
        System.out.println(il.size());
        print(il);
        System.out.println(il.get(6));
        il.clear();
        print(il);
    }

    private static void print(IntOnlyArrayList list){
        //udskrift som ArrayList - kan laves som toString i IntOnlyArrayList
        String s;
        //er listen tom skrives kun kantede parenteser
        if (list.size()==0){
            s = "[]";
        }
        else {
            //sæt først begyndelsesparentes og første tal (stakitproblemet)
            s = "[" + list.get(0);
            for (int i=1; i<list.size(); i++){
                //sæt komma og næste tal, så længe der er flere tal
                s += ", " + list.get(i);
            }
            //afslut med at sætte højre parentes
            s += "]";
        }
        //udskriv - kunne blive til return s i toString
        System.out.println(s);
    }
}
