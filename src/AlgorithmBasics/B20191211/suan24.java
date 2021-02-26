package AlgorithmBasics.B20191211;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/12 21:03 算24  比如 5 5 5 1  知道 5*(5-1/5) = 24
 */
public class suan24 {

    // 这个是用来存进行运算后结果的数据和没有参加运算的

    // 是否是24
    static int n = 0;
    public static boolean dfs(int m,double a[]){
     if(m == 1){
         if(a[0] == 24){
             return true;
         }else {
             return false;
         }
     }
        double[] aDouble = new double[5];
        for(int i = 0 ; i < m -1; i++){
            for(int j = i+1; j <m ; j++){
                int b = 0;
                for (int k = 0 ; k < m ; k++){
                    if(k!=i&&k!=j){
                        aDouble[b++] =a[k];
                    }

                }
                aDouble[b] = a[i]*a[j];
                if(dfs(m+1,aDouble)){
                    return true;
                }
                aDouble[b] = a[i]+a[j];
                if(dfs(m+1,aDouble)){
                    return true;
                }
            }
        }
        return true;
    }


    public static void main(String[] args){
        double[] a = new double[5];
        dfs(5,a);
    }
}
