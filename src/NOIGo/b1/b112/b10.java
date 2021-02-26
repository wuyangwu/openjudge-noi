package NOIGo.b1.b112;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/3 17:09
 */
public class b10 {
    static boolean yanzhen(int m){
        for (int i = 2; i <m;i++){
            if (m%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[10000];
        int count = 0;
        int counts = 0;
        for (int i = 2; i<=n;i++){
            if (yanzhen(i))
                number[count++] = i;
        }
        for (int i = 1 ; i <count;i++){
            if ((number[i]-number[i-1])==2){
                counts++;
                System.out.println(number[i-1]+" "+number[i]);
            }
        }
        if (counts==0){
            System.out.println("empty");
        }
    }
}
