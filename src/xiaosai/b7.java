package xiaosai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 20:30
 */
public class b7 {

    static int digui(int sum,int n){
         int a = n%10;
         sum +=a*a;
         if(n<10){
             return sum;
         }
        return digui(sum,n/10);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int conut = 0;
        for (int i =1 ; i <= m ;i++){
            int sum = 0;
            if(digui(sum,i)== n){
                conut++;
            }
        }
        System.out.println(conut);
    }
}
