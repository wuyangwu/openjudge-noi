package NOIGo.b2.b24;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/18 19:41
 */
public class b7622 {
    static int sum = 0;
    static void magers(int i, int center, int j, int[] a){

    }
    static void guibing(int i , int j,int a[]){
        if (i<j){
            int center = i+(j-i)/2;
            guibing(i,center,a);
            guibing(i,center+1,a);
            magers(i,center,j,a);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    }
}
