package com.iflytek.leetcode.demo;

import java.util.Arrays;

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
    
    public static void main(String[] args) {
        int[] source = {11,32,31,14,25};
        int target = 63;
        int[] result = findTwo(source,target);
        System.out.println(result);
    }
}
