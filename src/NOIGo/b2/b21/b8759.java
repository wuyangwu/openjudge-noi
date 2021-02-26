package NOIGo.b2.b21;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/13 21:53
 */
public class b8759 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int x1= a,x4=0,shangche = 0,xiache =0;
        for (int k = 0 ; k <=10000; k++){
            int x2 = k;
            x4 = a;x1=a;
            int count = 0;
            for (int i = 3; i<=n-1;i++){
                shangche = x1 +x2;
                xiache = x2;
                x4 += shangche -xiache;
                x1 = x2;
                x2 = shangche;
                if (i == x)
                    count = x4;
            }
            if (x4 == m){
                System.out.println(count);
                break;
            }
        }
    }
}
