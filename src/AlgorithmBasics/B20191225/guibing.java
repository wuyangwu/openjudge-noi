package AlgorithmBasics.B20191225;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/25 13:31 归并排序
 */
public class guibing {

    public static void mager(int[] a , int s , int m , int e, int[] b ){
        System.out.println(s+" "+m+" "+e+" ");
        int i = s , j =m+1, k=0;
        while (i <=m && j<=e ){
            if(a[i]<a[j]){
                b[k++] =  a[i++];
            }else {
                b[k++] = a[j++];
            }
        }
        while (i<=m){
            b[k++] = a[i++];
        }
        while (j <=e){
            b[k++] = a[j++];
        }
        for (int l = 0; l < (e-s)+1; l++) {
            a[s+l] = b[l];
        }
    }

    public static void magersort(int[] a ,int s , int e,int[] b){
        if(s<e){
            int  m  = s+ (e-s)/2;
            magersort(a,s,m,b);
            magersort(a,m+1,e,b);
            mager(a,s,m,e,b);
        }
    }

    public static void main(String[] args){
        int[] a = {7,3,14,12,8,6,2,13};
        int[] c = new int[8];
        magersort(a,0, 7 ,c);
        for (int i = 0; i < 8 ; i++) {
            System.out.println(c[i]);
        }
    }
}
