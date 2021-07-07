package lanqiaobei.b820200114;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/14 16:15  纸牌三角形
 */
public class zhipaisanjiao {

    static int[] a = new int[9];// 使用过的数字标记
    static int[] b = new int[9];// 存值
    static int sum = 0;

    static void dfs(int n){
        if(n==9){
            for (int i = 0; i <9 ; i++) {
                System.out.print(b[i]+" ");
            }
            System.out.println();
            if(((b[0]+b[1]+b[2]+b[3])==(b[3]+b[4]+b[5]+b[6]))&&((b[3]+b[4]+b[5]+b[6])==(b[6]+b[7]+b[8]+b[0]))){
                sum++;
            }
            return;
        }
        for(int i = 0 ; i < 9;i++){
            if(a[i] == 0){
                a[i]=1;
                b[n] = i;
                dfs(n+1);
                a[i] = 0;
            }
        }

    }
    public static void  main(String[] args){
        int b[] = new int[9];
        dfs(0);
        System.out.println(sum/6);
    }
}
