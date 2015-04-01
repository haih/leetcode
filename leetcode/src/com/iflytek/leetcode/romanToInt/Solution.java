package com.iflytek.leetcode.romanToInt;

public class Solution {
    public static int romanToInt(String roman) {
        int result = 0;
        String[] symbol ={"M","D","C","L","X","V","I"};  
        int[] number ={1000,500,100,50,10,5,1};
        int last = 10;
        for (int i = roman.length(); i > 0; i--) {
            String chString = String.valueOf(roman.charAt(i-1));
            for (int j = 0; j < symbol.length; j++) {
                if(chString.equals(symbol[j])){
                    if(j > last){
                        result -= number[j];
                    }else{
                        result += number[j];
                    }
                    last = j;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        System.err.println(romanToInt("MDC"));
    }
    
}
