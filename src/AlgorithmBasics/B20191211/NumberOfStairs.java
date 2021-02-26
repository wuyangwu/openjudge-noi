package AlgorithmBasics.B20191211;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/11 12:54 走楼梯问题
 */
public class NumberOfStairs {

    public static int dfs(int n){
        if(n==1|| n==0){
            return 1;
        }
        return dfs(n-1)+dfs(n-2);
    }

    public static void main(String[] args){
        System.out.println(dfs(5));
    }

}
