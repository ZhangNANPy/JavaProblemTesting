package com.zrn;

/**
 * Created by Administrator on 2017/11/6.
 */
public class Test {

    public static void main(String args[]){
        Test2 t=new Test2();//Test2继承Test1
    }

    public static String getMsg1(){
        System.out.println("invoke getMsg1");
        return "test1";
    }

    public static String getMsg2(){
        System.out.println("invoke getMsg2");
        return "test2";
    }

    public static String getMsg3() {
        System.out.println("invoke getMsg3");
        return "test3";
    }

    public static String getMsg4() {
        System.out.println("invoke getMsg4");
        return "test4";
    }
}
class Test1 {
    static {
        System.out.println("Test1 de static");
    }
    private static String ss=Test.getMsg1();
    private String s1=Test.getMsg2();
    public Test1(){
        System.out.println("Test1 gouzao");
    }
}
class Test2 extends Test1 {
    static {
        System.out.println("Test2 de static");
        Test2 tettt=new Test2();
    }
    private static String ss=Test.getMsg3();
    private String s1=Test.getMsg4();
    public Test2(){
        System.out.println("Test2 gouzao,ss="+ss+",s1="+s1);
    }
}

