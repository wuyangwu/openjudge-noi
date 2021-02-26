package AlgorithmBasics.B2019126;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/6 23:23
 */
//熄灯问题
public class S4 {
    static char[] orLights=new char[5];    //每个元素对应灯矩阵的一行
    static char[] light=new char[5];    //变化中的灯的矩阵
    static char[] result=new char[5];//结果开关矩阵
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;++i) {
            for(int j=0;j<6;++j) {
                int s=sc.nextInt();
                orLights[i]=setBit(orLights[i],j,s);
            }
        }
        for(int n=0;n<64;n++) {
            int switchs=n;
            System.arraycopy(orLights, 0, light, 0, 5);
            for(int i=0;i<5;i++) {
                result[i]=(char) switchs;
                for(int j=0;j<6;j++) {
                    if(getBit((char)switchs,j)==1) {
                        if(j>0)
                            light[i]=Flip(light[i],j-1);
                        light[i]=Flip(light[i],j);
                        if(i<5)
                            light[i]=Flip(light[i],j+1);
                    }
                }
                if(i<4)
                    light[i+1]^=switchs;
                switchs=light[i];

            }
            if(light[4]==0) {            //最后一行等于0，代表全部熄灭
                outputResult(result);
                break;

            }

        }
    }

    static int getBit(char c,int i) {
        //取C的第i位
        return (c>>i)&1;
    }
    static char setBit(char c,int i,int v) {
        //设置c的第i位为v
        if(v!=0)
            c|=(1<<i);
        else
            c&=~(1<<i);
        return c;
    }
    static char Flip(char c,int i) {
        //将c的第i位取反
        c^=(1<<i);
        return c;
    }
    static void outputResult(char result[]) {
        System.out.println("PUZZLE#");
        for(int i=0;i<5;i++) {
            for(int j=0;j<6;++j) {
                System.out.print(getBit(result[i],j));
                if(i<5)
                    System.out.print(" ");      //每个数之间有空格
            }
            System.out.println();
        }
    }

}
