package AlgorithmBasics.B20191211;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/11 21:11  整数划分
 */
public class ZhengShuHuafen {

    public static int dfs(int n ,int m){
        if(m == 1 || n == 1){
            return 1;
        }
        if( m > n){
            return dfs(n,n);
        }else if( m <n){
            return dfs(n-m,m)+dfs(n,m-1);
        }
         return 1+dfs(n,m-1);
    }

    public static void  main(String[] args){
        System.out.println(climbStairs(3));
//        System.out.println(dfs(4,4));
    }

    public static int climbStairs(int target){
        return helper(0, target);
    }

    public static int helper(int step, int target){
        //edge cases
        if(step == target){
            return 1;
        }

        if(step > target){
            return 0;
        }
        int i = helper(step + 1, target) + helper(step + 2, target);
        System.out.println(i);
        return i;
    }
}
