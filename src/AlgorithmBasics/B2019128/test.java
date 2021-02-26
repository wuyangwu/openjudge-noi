package AlgorithmBasics.B2019128;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/29 20:39
 */
public class test {
    public static void main(String[] args){
        int[] a = {2,5,3,1,7,4,6,0  };
        int[] b = {7,1,3,0,6,4,2,5  };
        int[][] a1 = new int[8][8];
        int[][] b1 = new int[8][8];
        for (int i=0; i< 8;i++){
            a1[i][a[i]] =1;
            b1[i][b[i]] =1;
        }

        for (int i = 0 ; i< 8; i++){
            for (int j = 0; j < 8 ; j++){
                //||a1[i][j]!=b1[7-j][j]
                System.out.println(a1[i][j]+" "+b1[7-j][i]);
                if (a1[i][j] != b1[7-i][7-j]){
                    System.out.println("N");
                    System.exit(0);
                }
            }
        }
        System.out.println("yes");
    }
}
