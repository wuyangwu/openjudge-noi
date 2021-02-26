package xiaosai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 19:31
 */
public class b5 {
   static String c1 = "aeiou";

    static boolean search(char c){
        for (int i = 0 ; i < c1.length(); i++){
            if(c1.charAt(i) == c){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int x = 0;
        int sum = 0;
        while (x<a.length()&&search(a.charAt(0))==false){
            if(x == a.length()){
                break;
            }
            while (x<a.length()&&search(a.charAt(x))==false){
                x++;
            }
            if(x == a.length()){
                break;
            }
            sum++;
            while (x<a.length()&&search(a.charAt(x))==true){
                x++;
            }
            sum++;
        }
        if(sum ==4){
            System.out.println("YES");
        }else {
            System.out.println("No");
        }
    }
}
