package xiaosai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 20:13
 */
public class b6 {

    static boolean digui(int n){
        if(n%10 == 2){
            return true;
        }
        if(n!=2 &&n<10){
            return false;
        }
        return digui(n/10);
    }

    public static void main(String[] args){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0;i < a;i++){
            if(digui(i)==false){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
