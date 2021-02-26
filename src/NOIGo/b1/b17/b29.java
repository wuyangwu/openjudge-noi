package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 22:07
 */
public class b29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        str = str.replaceAll("(-*)x","-10");
        String[] strs = str.trim().split("-");
        int sum = 0;
        int biaoshi = 1;
        for (int i = 0 ; i < strs.length-1; i++){
            for (int j = 0; j< strs[i].length(); j++){
                sum  = sum + (strs[i].charAt(j)-'0')*biaoshi++;
            }
        }
        if (sum%11 == 10){
            if ('X' ==strs[strs.length-1].charAt(0) ){
                System.out.println("Right");
            }else {
                for (int i = 0 ; i < strs.length-1; i++){
                    System.out.print(strs[i]+"-");
                }
                System.out.print('X');
            }

        }else {
            if (sum%11 == strs[strs.length-1].charAt(0)-'0'){
                System.out.println("Right");
            }else {
                for (int i = 0 ; i < strs.length-1; i++){
                    System.out.print(strs[i]+"-");
                }
                System.out.print(sum%11);
            }
        }

    }
}
