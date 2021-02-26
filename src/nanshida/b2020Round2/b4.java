package nanshida.b2020Round2;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 14:17
 */
public class b4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 有多少个纸堆
        int[] number = new int[n]; // 每个纸堆上有多少数据
        int sum = 0;
        for (int i = 0; i< n ; i++){
            number[i] = scanner.nextInt();
            sum += number[i];

        }
        int count =0, junzhi = sum/n;
        for (int i = 0; i<n;i++){
            if (number[i]==junzhi){
              continue;
            }
            number[i+1] +=number[i] - junzhi;
            count++;
        }

        System.out.println(count);
    }
}
