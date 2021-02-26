package nanshida.b2020Round2;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 15:16
 */
public class b5 {
    // 获取最大值和最大值的位置
    static int[] max(int[][] number , int m, int n){
        int max=0, maxx=0,maxy=0;
        for (int i =1; i<=m; i++){
            for (int j =1; j<=n;j++){
                if (max<number[i][j]){
                    maxx = i;
                    maxy = j;
                    max = number[i][j];
                }
            }
        }
        int[] maxs = new int[3];
        maxs[0] = max;
        maxs[1] = maxx; // 3
        maxs[2] = maxy; // 7
        return maxs;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = 0, n=0, k=0,chushix=0,chushiy=0;

        int[] max = new int[3];
         m = scanner.nextInt();
         n = scanner.nextInt();
         k = scanner.nextInt();
        int[][] number = new int[m+1][n+1];
        for (int i = 1; i<=m; i++){
            for (int j =1 ; j<=n;j++){
                number[i][j] = scanner.nextInt();
            }
        }
         max = max(number,m,n);
        chushiy = max[2]; //2
        int sum =0;
        while (true){
            // 计算采第一个最大的所需要的时间 这个是从初始位置到 最大的距离， 再从最大的到路口所需要的时间
            int count = Math.abs(chushiy-max[2])+Math.abs(chushix-max[1]) +max[1]+1;
            if (k>=count){
                k =k- count+max[1];
                sum += max[0];
                number[max[1]][max[2]] = 0;
                chushix = max[1];
                chushiy = max[2];
                max = max(number,m,n);
            }else {
                break;
            }
        }
        System.out.println(sum);
    }
}
