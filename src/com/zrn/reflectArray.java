package com.zrn;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/11/2.
 */
public class reflectArray {
    public static void main(String[] args) throws Exception{
//        System.out.println(Class.forName("[[I"));
//        System.out.println(int[][].class);
//        System.out.println(reflectArray[][].class);
        Class cls = A.class;
        //Method m = cls.getMethod("fVoid", null);
        //Method m = cls.getMethod("fNormal", new Class[]{int.class, String.class});
        //Method m = cls.getMethod("fArray", new Class[]{int[][].class, String[].class});
        Method m = cls.getMethod("fList", new Class[]{int[].class});
//        Method[] ms = cls.getMethods();
//        for (int i = 0; i < ms.length; i++) {
//            System.out.println(ms[i].getName());
//            Class[] paras = ms[i].getParameterTypes();
//            for (int j = 0; j <paras.length; j++) {
//                System.out.println(paras[j].getName());
//            }
//        }
        System.out.println(m.getName());
    }
}
