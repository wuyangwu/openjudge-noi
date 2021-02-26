package NOIGo.b1.b113;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/7 15:29
 */
public class b09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        int[] numbern = new int[n.length()+1];
        int[] numberm = new int[m.length()+1];
        int[] numberc = new  int[m.length()+n.length()+100];
        for (int i = 0; i< n.length(); i++)
            numbern[n.length()-i] = n.charAt(i)-'0';
        for (int j = 0; j<m.length(); j++)
            numberm[m.length()-j] = m.charAt(j)-'0';
        for (int i = 1; i<=n.length(); i++){
            int x = 0 ; // 进位标志
            for (int j = 1; j <=m.length();j++){
                numberc[i+j-1] = numbern[i]*numberm[j]+x+numberc[i+j-1];
                x = numberc[i+j-1]/10;
                numberc[i+j-1] %=10;
            }
            numberc[i+m.length()] = x;
        }
        int len = numberc.length-1;
        while (numberc[len]==0){
            len--;
            if (len == 1){
                break; // 注意0*0的问题
            }
        }
        for (int i = len; i>=1; i--){
            System.out.print(numberc[i]);
        }
    }
}
