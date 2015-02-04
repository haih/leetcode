package com.iflytek.leetcode.demo;


/**
 * Hello world!
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

