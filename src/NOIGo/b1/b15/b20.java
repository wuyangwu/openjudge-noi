package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 22:24
 */
public class b20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float h = scanner.nextInt();
        float sum = 0;
        for (int i =1 ; i <= 10 ; i++){
            sum += 1.5*h;
            h = h/2;

        }
        sum  -=h;
        System.out.println(sum);
        System.out.println(h);
    }
}
