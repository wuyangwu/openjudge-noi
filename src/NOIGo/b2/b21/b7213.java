package NOIGo.b2.b21;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/14 13:54 垃圾炸弹
 */
public class b7213 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int max=0;
        int count =0;
        int[][] number = new int[1025][1025];
        for (int i = 0; i< n; i++){
            int x = scanner.nextInt(); // 垃圾坐标
            int y = scanner.nextInt();
            int k = scanner.nextInt(); // 垃圾重量
            for (int j = 0; j<=1024;j++){
                for (int l = 0 ; l <=1024; l++){
                    int x1 = j-d;
                    int x2 = j+d;
                    int y1 = l-d;
                    int y2 = l+d;
                    if (x>=x1&&x<=x2&&y>=y1&&y<=y2){
                        number[j][l] += k;
                        if (max<number[j][l])
                            max = number[j][l];
                    }
                }
            }
        }
        for (int i =0 ; i<=1024;i++){
            for (int j =0; j<=1024;j++){
                if (max == number[i][j])
                    count++;
            }
        }
        System.out.println(count+" "+max);
    }
}
