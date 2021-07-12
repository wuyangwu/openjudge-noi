package Leetcode;

import java.util.Scanner;

public class 最长回文子串 {
    public  boolean panduan(String s){
        for (int i =0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return  false;
            }
        }
        return  true;
    }

    public String longestPalindrome(String s) {
        String max="";
        if(s.length()==1){
                return s;
        }

        for (int i =0; i<=s.length();i++){
            for (int j = i+1; j<=s.length();j++){
                if(panduan(s.substring(i,j))){
                    if(max.length()<s.substring(i,j).length()){
                        max = s.substring(i,j);
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

    }
}
