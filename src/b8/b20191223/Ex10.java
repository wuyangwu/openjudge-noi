package b8.b20191223;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/4 18:51
 */
public class Ex10 {
    static int[] a = {1,2,3,4,5};
    static int n = 5;
    static int count;

    public static void junt(int i,int j,int k){
        int sum =0;
        for(int l = i ; l<= j; l++){
            sum+=a[l];
        }
        if(sum%k==0){
            count++;
        }
    }

    public static void check(int k){
        for(int i = 0 ; i < n; i++){
            for(int j = i;j<n;j++){
                junt(i,j,k);
            }
        }
    }
    public static void main(String[] args){
        check(2);
        System.out.println(count);
    }
}
