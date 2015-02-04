package com.iflytek.leetcode.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] findTwo(int[] a, int target) {
        if (a.length <= 0 || target == 0) {
           return a; 
        }
        Arrays.sort(a);
        int[] ret = new int[2];
        int min = 0;
        int max = a.length-1;
        while(min < max){
            if(a[min] + a[max] == target)
            {
                ret[0] = min;
                ret[1] = max;
                return ret;
            } else {
                int sum = a[min] + a[max];
                if(sum > target) max--;
                else min++;
            }
        }
        System.out.println("Did not find the answer!");
        return ret;
    }
    
    public static int[] findTwoByHash(int[] a,int target){
        if (a.length <= 0 || target == 0) {
            return a; 
        }
        int[] ret = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        //这里是不用先把所有的数字塞进map中的，在计算的过程中，通过判断结果决定是否put到map中，line:53
//        for(int i = 0;i < a.length;i++) {
//            hashMap.put(a[i], i);
//        }
        for(int j = 0;j < a.length;j++) {
            if(hashMap.get(target - a[j]) != null) {
                int result = hashMap.get(target - a[j]);
                if(a[j] > target - a[j]) {
                    ret[1] = j;
                    ret[0] = result;
                    return ret;
                } 
                ret[1] = result;
                ret[0] = j;
            }
            hashMap.put(a[j], j);
        }
        return ret;
    }
    
    public static void main(String[] args) {
        int[] source = {11,32,31,14,25};
        int target = 57;
        int[] result = findTwoByHash(source,target);
        System.out.println(result[0] +" " + result[1]);
    }
}
