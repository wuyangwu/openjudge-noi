package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 22:57
 */
public class b41 {
    static int suanzhi(int n){
        int sum =0;
        while (n!=0){
            if(n%10==2)
                sum++;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int sum = 0;
        for (int i = L ; i<=R ; i++){
            sum +=suanzhi(i);
        }
        System.out.println(sum);
    }
}
