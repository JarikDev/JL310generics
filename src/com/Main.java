package com;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> ages=new ArrayList<>();
       Cell cell=new Cell<>();
       Cell<Number> num=new Cell<>();




   /*      //List ages=new ArrayList<>();
        Cell<String> stringCell=new Cell<>();
        stringCell.setT("Hello");
        String s=stringCell.getT();

        ages.add(20);
        //ages.add("String");
        for (int i = 0; i < ages.size(); i++) {
            int j=(Integer)ages.get(i);
            System.out.println(j);
            }
*/
    /*    Cell cell=new Cell();
        cell.setObject("hello");
        String s=(String)cell.getObject();
*/






    }
}

class Cell <T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
/*
class Cell{
    Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
*/





























