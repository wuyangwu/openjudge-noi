package xiaosai;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 18:26
 */
public class b3 {
    static int[][] a = new int[10][10];
    static int sum = 0 ;

    public static void main(String[] args){
        for(int i = 1; i <= 8; i++)
        {
            for(int j = 1; j <= 8; j++)
            {
                if(i == 1 && j == 1)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }
        System.out.println(a[8][8]);
    }
}
