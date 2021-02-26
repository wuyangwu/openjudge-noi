package b8.b20191223;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/3 20:16
 *
 */

/**
 *
 标题：纸牌三角形

 A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 下图就是一种排法（如有对齐问题，参看p1.png）。

 A
 9 6
 4   8
 3 7 5 2

 这样的排法可能会有很多。

 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

 请你计算并提交该数字。

 注意：需要提交的是一个整数，不要提交任何多余内容。

 * */
public class E2 {
    static int n[] = new int[9];
    static int a[] = new int[9];
    static int count =0;

    public static void dfs(int code){

        if(code == 9){
            if(n[0]+n[1]+n[3]+n[5] == n[0]+ n[2]+n[4]+n[8]&&n[0]+n[1]+n[3]+n[5]==n[5]+n[6]+n[7]+n[8]){
                count++;
            }
            return ;
        }
        for (int i = 0 ; i < 9;i++){
            if(a[i] == 0){
                a[i] = 1;
                n[code] = i+1;
                dfs(code+1);
                a[i] = 0;
            }
        }
    }

    public static void main(String[] args){

        int a[] = new int[10];
        //深度优先搜索
        dfs(0);
        System.out.println(count/6);
    }
}
