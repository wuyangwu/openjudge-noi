package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 18:33
 */
public class DNA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int d = 0; d <n;d++){
            int a = scanner.nextInt(); //
            int b = scanner.nextInt(); //
            char[][] number = new char[a*b][a];
            for (int i = 0; i<a;i++){
                for (int j =0; j<a;j++){
                    if (i==j||i+j==a-1){
                        number[i][j]= 'X';
                    }else {
                        number[i][j] = ' ';
                    }
                }
            }
            for (int i =0  ; i<b;i++){
                int c = 1;
                int j =((a-1)*i)+1;
                int m = j;
                for (;j<m+a-1;j++){
                    for (int k = 0; k<a;k++){
                        number[j][k] = number[c][k];
                    }
                    c++;
                }
            }
            for (int i =0 ; i< a*b-b+1;i++){
                for (int j =0 ;j < a;j++){
                    System.out.print(number[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
