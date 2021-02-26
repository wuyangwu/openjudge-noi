package AlgorithmBasics.B2019126;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0 11111
 * @date 2019/12/6 20:25 熄灯问题
 */
public class LightOffproblem {
    static byte[] orlights = {22,57,36,41,14};
//    static byte[] orlights = new byte[5];
    static byte[] lights = new byte[5];
    static byte[] results = new byte[5]; // 存结果集
    // 实际值1011001001  按照位置获取值100100101中100100101（这个1是第0位）
    public static int getByte(byte b,int j){
        return (b >> j) & 1;
    }
    // 存初始数据值 输出是1011001001
    public static void setByte(byte b[], int j ,int v ,int i){
        if( v == 1 ) {
            b[i] |=  (1 << j);
        } else {
            b[i] &=  ~(1 << j);
        }
    }

    // 翻转第i个位置
    public  static void FlipBit(byte b[] , int i ,int j){
        b[i]  ^=  (1 << j);
    }

    public static void main(String[] args){
        byte b = 0b10;
        byte d= (1<<2);
        byte c = ~(1 << 2);
        b &= ~(1 << 2);
//        System.out.println(b);
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<5;++i) {
//             for(int j=0;j<6;++j) {
//                int s=sc.nextByte();
//              setByte(orlights,j,s,i);
//            }
//        }
        // 枚举
        for(int i = 0; i <64 ; i++){
//            System.arraycopy(orlights, 0, lights, 0, 5);
            for(int m =0 ; m <5;m++){
                lights[m] = orlights[m];
            }
            // 作为第一行的结果集
            int  swiths  = i;
            for(int j = 0 ; j < 5; j++){
                results[j] = (byte) swiths;
                for( int k =0 ; k <6 ; k++){
                    if(getByte((byte) swiths,k) == 1){
                        if( k > 0)
                            FlipBit(lights,j,k-1);
                        FlipBit(lights,j,k);
                        if (k< 5)
                            FlipBit(lights, j ,k+1);
                    }
                }
               if(j < 4)
                   lights[j+1] ^=  swiths; 
               swiths = lights[j];
            }
            if( lights[4] == 0){
                for(int m = 0 ; m < 5 ;m++){
                    for(int n = 0; n < 6; n++ ){
                        System.out.print(getByte(results[m],n)+"  ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
