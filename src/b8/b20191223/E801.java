package b8.b20191223;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/3 19:50 背包整列
 */
public class E801 {
    //价值
    static int[] weight= {10,40,30,50};
    //重量
    static int[] v = {5,4,6,3};

    public static void main(String[] args) {
        //背包重量 放重量的最优解
        int n = 10;
        int a[][] = new int[5][11];

        for(int i =1 ; i < 5; i++){
            for(int j =1; j <=10 ;j++){
                if(j >= v[i-1]){
                    a[i][j] = a[i-1][j -v[i-1]]+weight[i-1];
                    if(a[i][j]< a[i-1][j]){
                        a[i][j] = a[i-1][j];
                    }
                }else {
                    a[i][j] = a[i-1][j];
                }
            }
        }

        System.out.println();
    }
}
