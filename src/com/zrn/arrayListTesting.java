package com.zrn;

import java.util.ArrayList;
/**
 * Created by Administrator on 2017/10/30.
 */
public class arrayListTesting {
    public static void main(String[] args){
        ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
        Dog aDog = new Dog();
        myDogArrayList.add(aDog);
        Dog a = myDogArrayList.get(0);

        ArrayList<Object> myDogArrayList1 = new ArrayList<Object>();
        Dog aDog1 = new Dog();
        myDogArrayList1.add(aDog1);
        //Dog a1 = myDogArrayList1.get(0);//取出的对象都是object类的实例，所以不能转换为Dog类型
    }
    public Object getObject(Object o){
        return o;
    }
    public void go(){
        Dog adog =new Dog();
        Object sameDog = getObject(adog);
    }
}