package NOIGo.b1.b113;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/6 15:38
 */
public class b02 {
    static int day(int monters){
        if (monters ==2 )
            return 28;
        if (monters == 8||monters==10||monters==12)
            return 31;
        if (monters==9||monters==11)
            return 30;
        if (monters %2 == 1)
            return 31;
        else return 30;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int  w = scanner.nextInt();

        for (int i = 1 ; i <= 12; i++){
            int monterday = day(i);
            for (int j = 1 ; j <=monterday; j++){
                if (j == 13&&w==5){
                    System.out.println(i);
                }
                if (w !=7)
                    w++;
                else w=1;
            }
        }

    }
}
