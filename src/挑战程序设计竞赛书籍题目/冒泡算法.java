package 挑战程序设计竞赛书籍题目;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/6/1 9:32
 */
public class 冒泡算法 {
    private static  int[] a = {2,1,7,8,4,9,5,3};
    public static void main(String[] args) {
        for(int i = 0; i< a.length;i++){
            for (int j = 0 ; j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"     ");
        }
        System.out.println();
    }
}
