package AlgorithmBasics.B20191215;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/15 15:27 输入n个整数 找出其中的两个数，他们之和等于整数m 假定肯定有解决
 */
public class Nerfen {

    static int a[] = {2,3,5,6,7,9,12,14,15,19};
    static int center = 0;
    static int alength = 10;

    public static void erfen(int m){
        for(int i = 0; i < alength -1;i++){
            int j = i+1;
            int jlength = alength-1;

            while (j<=jlength){
                center = j+(jlength-j)/2;
                if(a[center]+a[i] == m){
                    break;
                }
                if((m-a[i])> a[center]){
                    j = center+1;
                }else {
                    jlength = center-1;
                }

            }
            if(a[center]+a[i] == m){
                System.out.println(a[center]+" "+a[i]);
            }

        }
    }


    public static void main(String[] args) {
        erfen(11);
    }
}
