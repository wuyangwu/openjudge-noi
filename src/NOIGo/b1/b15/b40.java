package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 22:47
 */
public class b40 {

    static int suanzhi(int n){
        int sum =0;
        while (n!=0){
            if(n%10==1)
                sum++;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        for (int i = 10; i<= n; i++){
            sum +=suanzhi(i);
        }
        System.out.println(sum);
    }

}
