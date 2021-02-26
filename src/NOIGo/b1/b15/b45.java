package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0 1 4 9 16 25
 * @date 2020/1/21 15:15  1 (1) 23(4) 456(9) 6天一共 14个 78910(16);
 */
public class b45 {
    public static void main(String[] args){
        int d,d1=2,moe=1,mymoe=0;
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();
        for(int i=1;i<d;i++){
            if(d1%moe==0){
                d1=0;moe++;
            }
            mymoe +=moe;
            d1 ++;
        }
        System.out.println(mymoe+1);
    }
}
