package AlgorithmBasics.B20191225;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/25 15:07 快速排序
 */
public class kuaisu {


    public static void kuaisusort(int[] a, int s, int e){
        if (s >= e )
            return;
        int k = a[s],i = s , j = e;
        while (i!=j){
            while (j> i&&a[j]>=k){
                j--;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            while (j >i && a[i] <= k){
                i++;
            }
            int tem1p = a[i];
            a[i] = a[j];
            a[j] = tem1p;
        }
        kuaisusort(a,s,i-1);
        kuaisusort(a,i+1,e);
    }
    public static void main(String[] args){
        int[] a = {0,1,3,8,12,11,2,9};
        kuaisusort(a,0,7);
    }
}
