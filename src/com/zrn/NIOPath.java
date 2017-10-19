package com.zrn;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Administrator on 2017/10/19.
 */
public class NIOPath {
    public static void main(String[] args) {
        // write your code here
        String filePath = "src/com/zrn";
        Path path = Paths.get(filePath, "Main.java");
        if(Files.exists(path)) {
            System.out.println("OK");
        }else{
            System.out.println("OOOOOOOh,on!");
        }
    }
}
