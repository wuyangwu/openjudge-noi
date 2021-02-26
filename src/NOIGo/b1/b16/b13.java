package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 21:28
 */
public class b13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int[] number = new int[31];
        int[] numbers = new int[31];
        int biaoji = 0;
        for (int i = 0; i< a.length(); i++){
            number[i] = a.charAt(i) - '0';
            numbers[i] = a.charAt(i) - '0';
        }
        if (number[0]!=0) {
            for (int k = 2; k <= 9; k++) {
                for (int i = 0; i < a.length(); i++) {
                    if (i == 0) {
                        number[i] %= k;
                    } else {
                        number[i] = number[i - 1] * 10 + number[i];
                        number[i] %= k;
                    }
                }
                if (number[a.length() - 1] == 0) {
                    biaoji = 1;
                    System.out.print(k + " ");
                }
                for (int i = 0; i < a.length(); i++) {
                    number[i] = numbers[i];
                }
            }
        }

        if (biaoji == 0){
            System.out.println("none");
        }
    }
}
