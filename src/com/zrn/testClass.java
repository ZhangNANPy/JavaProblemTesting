package com.zrn;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/1.
 */
public class testClass {
    public static void main(String[] args) throws Exception{
        Class cls= A.class;
        //Method m = cls.getMethod("fVoid", null);
        //Method m = cls.getMethod("fNormal", new Class[]{int.class, String.class});
        Method m = cls.getMethod("fArray", new Class[]{int[][].class, String[].class});
        //Method m = cls.getMethod("fList", new Class[]{int[].class});

        //write部分  传入的是m
        String methodName = m.getName();
        String methodClass = m.getDeclaringClass().getName();
        Class[] types = m.getParameterTypes();
        String parameter = "";
        for (int i = 0; i < types.length; i++) {
            parameter += types[i].getName() + ",";
        }
        parameter = parameter.substring(0, parameter.length() - 1);
        String res = methodClass + "," + methodName + "," + parameter;
        //字符串构造完成
        System.out.println(res);

        //read部分，传入的相当于是字符串
        String[] method = res.split(",");
        Class readCls = getClazz(method[0]);
        Class[] para = null;
        if (method.length > 2){
            para = new Class[method.length - 2];
        }
        for (int i = 2; i < method.length; i++) {
            para[i - 2] = getClazz(method[i]);
        }
        Method readMethod = readCls.getMethod(method[1], para);
        //得到read的结果
        System.out.println(readMethod);
    }

    public static Class getClazz(String className) throws ClassNotFoundException{
        if ("int".equals(className)) {return int.class;}
        if ("byte".equals(className)) {return byte.class;}
        if ("short".equals(className)) {return short.class;}
        if ("long".equals(className)) {return long.class;}
        if ("char".equals(className)) {return char.class;}
        if ("float".equals(className)) {return float.class;}
        if ("double".equals(className)) {return double.class;}
        if ("boolean".equals(className)) {return boolean.class;}
        return Class.forName(className);
    }
}

class A{
    public void fNormal(int i, String s){
        System.out.println(i + s);
    }

    public void fVoid(){}

    public void fList(int... a){}

    public void fArray(int[][] a, String[] s){}
}
