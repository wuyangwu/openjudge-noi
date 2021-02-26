package b8.b20191223;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/5 20:53
 */
public class Square {
    static int count=0;
    static int a[] = new int[10];
    static Long c[] = new Long[10];

    public static boolean jut(Long n){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Long j = n;
        int i = 0;
        do {
            hashSet.add((int)(n%10));
            if(a[(int)(n%10)] == 1){
                return false;
            }
            i++;
            n = n /10;
        }while (n!=0);
        if(hashSet.size() != i){
            return false;
        }
//        System.out.println(j);
        return true;
    }

    public static void add(Long n){

        do {
            a[(int)(n%10)] = 1;
            n=n/10;
        }while (n!=0);
    }

    public static void jian(Long n){
        do {
            a[(int)(n%10)] = 0;
            n=n/10;
        }while (n!=0);
    }
    public static void dfs(int coun,int last ,Long begin){
        if(coun == 10){
            for(int i = 0 ; i < last; i++){
                System.out.print(c[i]+"  ");
            }
            System.out.print("  "+(count++)+"\n");
            return;
        }

        /*
        * 0  1  4  9  872356    0
0  1  4  872356  9    1
0  1  4  3297856    2
0  1  4  3857296    3
0  1  4  5827396    4
0  1  4  6385729    5
0  1  4  8567329    6
0  1  4  9572836    7
    0  1  9  4  872356    8
0  1  9  25  36  784    9
0  1  9  25  784  36    10

0 1 4 9 872356 -->0
0 1 4 3297856 -->1
0 1 4 3857296 -->2
0 1 4 5827396 -->3
0 1 4 6385729 -->4
0 1 4 8567329 -->5
0 1 4 9572836 -->6
0 1 9 25 36 784 -->7
0 1 36 529 784 -->8
0 1 49 872356 -->9
0 1 64 537289 -->10
0 1 256 73984 -->11
        * */
        //i的值要往下传递否则会出现重复数字 这样
        for(Long i = begin; i<100000;i++){
            if(jut(i*i)){
                // 记录哪些数字被使用
                add(i*i);
                int len = String.valueOf((long)i*i).length();//i*i长度
//                coun+= len;
                c[last] = i*i;
                dfs(coun+len,last+1,i+1);
                jian(i*i);
//                coun-=len;
            }
        }
    }


    public static void main(String[] args){
        dfs(0,0, (long) 0);

    }
}
