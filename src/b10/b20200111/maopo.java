package b10.b20200111;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/11 20:28 冒泡排序
 */
public class maopo {
    public static void  main(String[] args){
        int[] a = {9,2,1,4,10,0,8,6};
        for (int i = 0 ; i < a.length-1; i++){
            for (int j = 0 ; j < (a.length-1)-i;j++){
               if(a[j]>a[j+1]){
                   int temp = a[j];
                   a[j]= a[j+1];
                   a[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(a[i]+ " ,");
        }
    }
}
