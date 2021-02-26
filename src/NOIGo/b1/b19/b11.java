package NOIGo.b1.b19;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 20:12
 */
public class b11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String number = scanner.next();
        int c = 0;
        int sum =0;
        for (int i = 0 ; i < number.length(); i++){
            if (number.charAt(c) == number.charAt(i)){
                sum++;
            }else {
                c = i;
                sum = 1;
            }
            if (sum == k)
                break;
        }
        if (sum==k){
            System.out.println(number.charAt(c));
        }else {
            System.out.println("No");
        }
    }
}
