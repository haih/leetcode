package com.iflytek.leetcode.intToRoman;

public class Solution {
    public static String intToRoman(int num) {
        if(num > 3999 || num < 1){
            return "";
        }
        String result = "";
        String[] symbol ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        int[] number ={1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
        for (int i = 0; i < symbol.length; i++) {
            while(num >= number[i]){
                num -= number[i];
                result +=symbol[i];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        System.err.println(intToRoman(1863));
    }
    
}
