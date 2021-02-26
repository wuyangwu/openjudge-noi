package NOIGo.b1.b17;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 23:08
 */
public class b30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stra = scanner.next();
        stra += stra;
        String strb = scanner.next();
        strb += strb;
        int max =0;
        if (stra.length()<strb.length()){
            String a = stra;
            stra = strb;
            strb = a;
        }
        int lens = Math.min(stra.length(),strb.length());
        int[][] sum = new int[stra.length()][strb.length()];
        for (int i = 0 ; i< stra.length()-1;i++){
            for (int j= 0 ; j < strb.length()-1; j++){
                if (stra.charAt(i)== strb.charAt(j)){
                    if (i == 0 || j== 0){
                        sum[i][j] = 1;
                    }else {
                        sum[i][j] = sum[i-1][j-1]+1;
                    }
                    if (sum[i][j]>max&&sum[i][j]<=lens/2){
                        max = sum[i][j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
