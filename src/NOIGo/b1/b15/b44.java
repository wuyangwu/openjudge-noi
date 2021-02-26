package NOIGo.b1.b15;

import java.util.Arrays;
import java.util.Scanner;

// 欧拉筛选素数
public class b44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        boolean[] check = new boolean[10000000];
        int count = 0;
        int[] premlist = new int[m+2];
        for (int i = 2 ; i < 10000000;i++){
            if(!check[i]){
                premlist[count++] = i;
            }
            if(count == m){
                break;
            }
            for (int index = 0 ; index< count;index++){
                if(i*premlist[index]>=10000000)
                    break;
                check[i*premlist[index]] = true;
                if(i%premlist[index]==0){
                    break;
                }
            }
        }
        System.out.println(premlist[m-1]);
    }
}
