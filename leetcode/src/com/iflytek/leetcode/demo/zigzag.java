package com.iflytek.leetcode.demo;


/**
* 
* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
* (you may want to display this pattern in a fixed font for better legibility)
* 
* P   A   H   N
* A P L S I I G
* Y   I   R
 * 
 */
public class zigzag {
    public static String convert(String text, int nRows){
        if(nRows <= 1 || nRows > text.length()){
            System.out.println("param nRows is invalid!");
            return text;
        }
        StringBuffer aLine = new StringBuffer();
        StringBuffer[] aList = new StringBuffer[nRows];
        int row = 0;
        int step = 1;
        //字符串数组初始化
        for(int i = 0;i < nRows;i++){
            aList[i] = new StringBuffer();
        }
        //业务逻辑处理
        for(int i = 0;i < text.length();i++){
            if(row == 0){
                step = 1; 
            }
            if(row == (nRows-1)){
                step = -1;
            }
            aList[row].append(text.charAt(i));
            row = row + step;
        }
        //转成String类型输出
        for(int i = 0;i < nRows;i++) {
            aLine.append(aList[i]);
        }
        return aLine.toString();
    }
    public static void main( String[] args )
    {
        String test = "123456789123456789";
      //System.out.println("".equals(null));
        String res = convert(test,4);
        System.out.println(res);
    }
}

