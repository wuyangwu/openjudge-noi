package NOIGo.b1.b18;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 13:48
 */
public class b20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        String strs = scanner.next();
        char[][] numbers = new char[strs.length()/n][n];
        for (int i = 0; i<strs.length()/n; i++){
            for (int j = 0 ; j<n;j++){
            if (i%2==0){
                numbers[i][j] = strs.charAt(i*n+j);
            }else {
                numbers[i][n-j-1] = strs.charAt(i*n+j);
            }
            }
        }
        for (int j = 0; j<n;j++){
            for (int i = 0 ; i < strs.length()/n; i++){
                System.out.print(numbers[i][j]) ;
            }
        }
    }

}
