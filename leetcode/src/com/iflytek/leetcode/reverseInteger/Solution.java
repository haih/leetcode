package com.iflytek.leetcode.reverseInteger;

public class Solution {
    public static int reverseByString(int x) {
        int result = 0;
        if (x == 0) {
            return 0;
        }
        StringBuffer buff = new StringBuffer();
        buff.append(x);

        buff = buff.reverse();
        if (x < 0) {
            char symbol = buff.charAt(buff.length() - 1);
            buff.deleteCharAt(buff.length() - 1);
            buff.insert(0, symbol);
        }
        // System.out.println(buff);
        try {
            result = Integer.valueOf(buff.toString());
        } catch (Exception e) {
            // e.printStackTrace();
            return 0;
        }
        return result;
    }

    public static int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return -reverse(-x);
        }
        int y = 0;
        do {
            // y * 10 + x % 10 > Integer.MAX_VALUE
            if (y > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }

            y = y * 10 + x % 10;

            x /= 10;

        } while (x > 0);
        return y;
    }

    public static void main(String[] args) {
        // 2的31次方-1
        int max = -2147483647;
        int i = -1000;
        System.out.println(reverse(max));
    }
}