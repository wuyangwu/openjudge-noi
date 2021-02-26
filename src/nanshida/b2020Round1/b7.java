package nanshida.b2020Round1;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/4 16:14
 */
public class b7 {

    static int yihuo(int m ){
        return m^1;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] chushinumber = new int[4][4];
        int[][] mubiaonumber = new int[4][4];
        for (int i = 0 ; i< 4; i++){
            for (int j = 0; j < 4; j++){
                chushinumber[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i< 4; i++){
            for (int j = 0; j < 4; j++){
                mubiaonumber[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 4; j++){
                if (j!=0){
                    if (chushinumber[i][j] != mubiaonumber[i][j]){
                        if (chushinumber[i+1][j] == 1){

                        }
                    }

                }
            }
        }
    }
}
