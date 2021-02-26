package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 23:49 高精度乘机
 */
public class b16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String m =scanner.next();
        String n = scanner.next();
        int[] numberm = new int[m.length()+1];
        int[] numbern = new int[n.length()+1];
        int[] c = new int[m.length()+n.length()+2];
        for (int i = 0 ; i<=m.length()-1; i++){
            numberm[m.length()-i] = m.charAt(i)-'0';
        }
        for (int i = 0 ; i<=n.length()-1; i++){
            numbern[n.length()-i] = n.charAt(i)-'0';
        }
        for (int i=1;i<=m.length();i++)
        {
            int x=0;                                               //用于存放进位
            for (int j=1;j<=n.length();j++)                     //对乘数的每一位进行处理
            {
                c[i+j-1]=numberm[i]*numbern[j]+x+c[i+j-1]; //当前乘积+上次乘积进位+原数
                x=c[i+j-1]/10;
                c[i+j-1] %= 10;
            }
            c[i+n.length()]=x;                                  //进位
        }
        int lenc=m.length()+n.length()+1;
        while (c[lenc]==0)       //删除前导0
            lenc--;
        for (int i=lenc;i>=1;i--)
            System.out.print(c[i]);

    }
}
