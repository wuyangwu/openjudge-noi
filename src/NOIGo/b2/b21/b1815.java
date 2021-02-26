package NOIGo.b2.b21;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/13 14:15
 */
public class b1815 {

    //翻转
    static void Fanzhuan(int n[] , int i, int j ){
        n[i] ^= (1<<j);
    }

    // 获取每一位的值
    static int getByte(int b,int j){
        return (b>>j)&1;
    }

    static void setByte(int n[] , int m, int i,int j){
        if ( m== 1){
            n[i] |= (1<<j);
        }else {
            n[i] &= ~(1<<j);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        String[] number = new String[n]; //  w代表1  y为0;
        int[] numbers  =  new int[n];  // 用位运算
        int[] ornumbers = new int[n];
        int[] results = new int[n];  // 结果集
        int sum = 999999,count =0;
        for (int i = 0; i< n; i++) //录入数据
            number[i] = scanner.next();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (number[i].charAt(j) == 'w')
                    setByte(numbers,1,i,j);
            }
        }
        int cishu = (int) Math.pow(2,n);
        for (int i =0 ; i< cishu; i++){
            int swiths = i;
            for (int j = 0; j< n; j++){
                ornumbers[j] = numbers[j];
            }

            for (int j=0; j < n;j++){
                //
                results[j] = swiths;
                for (int k =0; k < n; k++){
                    // 对每个结果集为1的进行翻转
                    if (getByte(swiths,k) == 1){
                        if (k>0)
                            Fanzhuan(ornumbers,j,k-1);
                        Fanzhuan(ornumbers,j,k);
                        if (k<n-1)
                            Fanzhuan(ornumbers,j,k+1);
                    }
                }
                if (j<n-1)
                    ornumbers[j+1] ^= swiths;
                swiths = ornumbers[j];
            }
            if (ornumbers[n-1] == 0){
                count = 0;
                for (int j = 0 ; j< n; j++){
                    for (int k = 0; k<n;k++){
                        if (getByte(results[j],k)==1)
                            count++;
                    }
//                    System.out.println();
                }
                if (count<sum)
                    sum = count;
//                System.out.println(sum);
            }
        }
        if (sum ==999999)
            System.out.println("inf");
        else System.out.println(sum);
    }
}
