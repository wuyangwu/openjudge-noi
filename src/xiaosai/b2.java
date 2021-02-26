package xiaosai;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 18:08
 */
public class b2 {
    static int a= 2019;
    static int[] b = new int[100];
    public static void main(String[] args){
        int i = 0;
        int c = a;
        while (c!=0){
            b[i] = (a>>i)&1;
            c = a>>i;
            i++;
        }
        for (int j = i-1; j>=0;j--) {
            System.out.print(b[j]+" ");
        }
    }
}
