package b8.b20191223;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/4 20:22 平方数
 */
public class Main{
    static int[] vis = new int[10];//全程标记数组
    static int[] temVis =new int[10];//用于检测自身是否有重复
    static long[] res = new long[10];//存满足条件的一组组合，用作输出
    static int ant  = 0; //次数
    public static void main(String[] args){
        //i从第一位开始枚举，j从第几个数开始平方枚举，k当前这种情况的第几块数
        dfs(0,0,0);
        System.out.println(ant);
    }

    public static void dfs(int coun,long last, int resindex){
        if(coun == 10){
            //试探到第十个数，自然完成一组组合
            for(int i=0; i<resindex; ++i)
                System.out.print(res[i]+" ");
            System.out.println("-->"+(ant++));
            return;
        }
        for(long i=last; i<=100000; ++i){
            int k = (int) (i*i);
            if(isNorepeat((long)i*i,i)){//如果自身没有重复的数字
                //并且与当前组合的前面数没有重复，说明当前的i*i可以成为组合的一部分
                mark(i*i); //更新全局标记数组

                int len = String.valueOf((long)i*i).length();//i*i长度
                coun += len; //coun表示当前组合的第几个数
                res[resindex] = i*i; //用于输出，存满足条件的组合数据

                dfs(coun, i+1, resindex+1);

                remark((long)i*i);//返回上一层
                //这里说一下，为什么要返回上一层，
                //首先代码能执行到这里，有俩种情况
                //其一，递归结束条件有return
                //其二，循环终止
                //显然应该是递归终止，所以说明找到了一种情况，所以需要将当前标记消
                //去，即返回上一层
                coun -= len; //长度自然要减下去
            }
        }
    }
    //若此j的平方满足条件，则可以加入待组合的后面
    public static void mark(long num){
        if(num ==0){
            vis[0] = 1;
            return;
        }
        while(num != 0){
            vis[(int) (num%10)] = 1;
            num /= 10;
        }
    }
    //判断当前的数自身是否有重复的数字
    public static boolean isNorepeat(long num,Long j){
        for(int i=0; i<10; ++i)
            temVis[i] = 0;
        if(num == 0){
            if(vis[0] == 0){
                vis[0] = 1;
                return true;
            }else
                return false;
        }
        while(num != 0){
            if(temVis[(int) (num%10)]==1 || vis[(int) (num%10)]==1 ){
                return false;
            }
            temVis[(int) (num%10)] = 1;
            num /= 10;
        }
        return true;

    }
    //dfs后，返回上一层
    public static void remark(long num){
        if(num == 0){
            vis[0] = 0;
            return;
        }
        while(num != 0){
            vis[(int) (num%10)] = 0;
            num /= 10;
        }
    }
}