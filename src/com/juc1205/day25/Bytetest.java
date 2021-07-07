package com.juc1205.day25;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/4/6 10:04
 */
public class Bytetest {
    public static void main(String[] args) {
        byte[] a = {2,3,13};
        System.out.println(bytesToHexString(a));

    }

    public static String bytesToHexString(byte[] src)
    {
        StringBuilder stringBuilder = new StringBuilder("");
        if ((src == null) || (src.length <= 0)) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString().toUpperCase();
    }
}
