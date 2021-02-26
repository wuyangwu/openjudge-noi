package b8.b20191223;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/3 15:51 包子问题
 */
public class Ex8 {
    //用于存放包笼存放的包子数目
    static int[] a = new int[100];

    static int[] s = new int[100*100];

    static  int gcd(int m,int n){
        if( n == 0 )
            return m;
        else  return gcd(n,n%m);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for(int i =0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int  m = a[0];
        for(int j = 1; j < n; j++){
            m = gcd(m,a[j]);
        }
        //背包写法
        s[0] = 1;
        for(int i =0 ;i <n;i++){
            for(int j = 0; a[i]+j <10000;j++){
                if(s[j] == 1){
                    s[a[i]+j] = 1;
                }
            }
        }

        for( int j = 0 ; j < 10000;j++){
            if(s[j] == 0){
                System.out.println(j);
            }
        }
    }
}
