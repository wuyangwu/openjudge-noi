package com.juc1205.suanfa;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/25 22:22
 */
public class digui {

    static int[] c = new int[999999];
    static int[] d = new int[999999];
    static int[] a;
    static int[] b;
    static int n;
    static int count=0;
    static void dfs(int j){

        if(j==n){
            for (int k =0;k<n;k++){
                if(a[d[k]]>b[k]){
                    return;
                }
            }
            count++;
            System.out.println();
        }

        for(int i =0;i<n;i++){
            if(c[i]==0){
                c[i] =1;
                d[j]= i;
                dfs(j+1);
                c[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        b = new int[n];
        for (int i = 0;i < n;i++){
            a[i] =scanner.nextInt();
        }
        for (int i = 0; i<n;i++){
            b[i] = scanner.nextInt();
        }
        dfs(0);
        System.out.println("结果数"+count);
    }
}
