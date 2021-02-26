package nanshida.b2020Round1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0 5
 * 1 2 3 4 5
 * 1+2 = 3
 * 3+3 = 6
 * 4+5 = 9
 * 9+6 = 15
 * @date 2020/2/4 14:10
 */
public class b5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        int[] oldnumber = new int[n-1];
        for (int i = 0 ; i < n; i++){
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number,0,n);
        int c = 1,i=2,j=0,op1=0,op2=0;
        oldnumber[0] = number[0]+number[1];
        long sum = oldnumber[0];
        while (++c<n){
            if (i<n&&number[i]<oldnumber[j])
                op1 = number[i++];
            else op1 = oldnumber[j++];

            if (i<n&&number[i]<oldnumber[j]){
                op2 = number[i++];
            }else {
                if (oldnumber[j]==0)
                    op2 = number[i++];
                else op2 = oldnumber[j++];
            }

            oldnumber[c-1] = op1+op2;
            sum +=oldnumber[c-1];
        }
        System.out.println(sum);
    }
}
