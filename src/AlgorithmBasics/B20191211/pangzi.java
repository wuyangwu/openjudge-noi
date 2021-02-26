package AlgorithmBasics.B20191211;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/11 13:56 盘子问题
 */
public class pangzi {

    public static int dfs(int n, int m){
        if(m > n ){
            return dfs(n , n);
        }
        if(n == 0){
            return 1;
        }
        if( n==1 || m == 1){
            return 1;
        }
        return dfs(n-m,m)+dfs(n,m-1);
    }

    public static void main(String[] args){
        System.out.println(dfs(7,3));
    }
}
