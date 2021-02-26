package NOIGo.b2.b23;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/15 16:07
 */
public class b6262 {
    public static void main(String[] args){
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        String[] oldnumber = new String[n];
        for (int i = 0; i< n; i++){
            numbers[i] = scanner.next();
            oldnumber[i] = numbers[i];
        }
        int m = scanner.nextInt(); // 天数
        int count = 0;
        for (int i = 1; i<m;i++){
            for (int j =0 ; j<n;j++){
                for (int k =0; k<n; k++){
                    if (oldnumber[j].charAt(k)=='@'){
                        for (int l =0 ;l<4;l++){
                            int dxx = j+dx[l];
                            int dyy = k+dy[l];
                            if (dxx>=0&&dxx<=n-1&&dyy>=0&&dyy<=n-1&&oldnumber[dxx].charAt(dyy)=='.'){
                                // 感染为.的用户
                                StringBuilder sb = new StringBuilder(numbers[dxx]);
                                sb.replace(dyy,dyy+1,"@");
                                numbers[dxx] = sb.toString();
                            }
                        }
                    }
                }
            }
            for (int j =0; j < n; j++){
                oldnumber[j] = numbers[j];
            }
        }
        for (int i =0; i< n; i++ ){
            for (int j = 0; j <n; j++){
                if (oldnumber[i].charAt(j)=='@')
                    count++;
            }
        }
        System.out.println(count);
    }
}
