package com.zrn;

/**
 * Created by Administrator on 2017/10/27.
 */
public class cycleMatrix {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            printCycleMatrixL(i);
            System.out.println();
        }

    }

    public static void printCycleMatrix(int n){
        for (int i = 0; i < n; i++) {
            int k;
            for (k = n; k > n - i; k--) {
                System.out.print(k);
                System.out.print(' ');
            }
            for (k = 0; k < 2 * n - 1 - 2 * i; k++){
                System.out.print(n - i);
                System.out.print(' ');
            }
            for (k = n - i + 1; k <= n; k++) {
                System.out.print(k);
                System.out.print(' ');
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            int k;
            for (k = n; k > i + 1; k--) {
                System.out.print(k);
                System.out.print(' ');
            }
            for (k = 0; k < 2 * i + 1; k++){
                System.out.print(i + 1);
                System.out.print(' ');
            }
            for (k = i + 2; k <= n; k++) {
                System.out.print(k);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void printCycleMatrixL(int line){

        int halfLine = line / 2;
        int maxNum = halfLine;
        if (line % 2 == 1) {
            maxNum++;
        }
        String format = "%-" + String.valueOf(String.valueOf(maxNum).length() + 1) + "d";

        for (int i = 0; i < halfLine; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(format, maxNum - j);
            }
            for (int j = 0; j < line - i * 2; j++) {
                System.out.printf(format, maxNum - i);
            }
            for (int j = 0; j < i; j++) {
                System.out.printf(format, maxNum - (i - j) + 1);
            }
            System.out.println();
        }

        if (line % 2 == 1){
            for (int i = maxNum; i > 0; i--) {
                System.out.printf(format, i);
            }
            for (int i = 2; i <= maxNum; i++) {
                System.out.printf(format, i);
            }
            System.out.println();
        }

        for (int i = 0; i < halfLine; i++) {
            int arrayLen = halfLine - i - 1;
            for (int j = 0; j < arrayLen; j++) {
                System.out.printf(format, maxNum - j);
            }
            for (int j = 0; j < line - arrayLen * 2; j++) {
                System.out.printf(format, maxNum - (halfLine - i - 1));
            }
            for (int j = 0; j < arrayLen; j++) {
                System.out.printf(format, maxNum - arrayLen + j + 1);
            }
            System.out.println();
        }
    }
}
