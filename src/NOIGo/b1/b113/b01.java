package NOIGo.b1.b113;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/3 20:34 进制转换
 */
public class b01 {
    static int panduan(char number){
        switch (number){
            case 'a': return 10;
            case 'b': return 11;
            case 'c': return 12;
            case 'd': return 13;
            case 'e': return 14;
            case 'f': return 15;
            default: return number-'0';
        }
    }

    static char panduans(int number) {
        switch (number){
            case 10:return 'A';
            case 11:return 'B';
            case 12:return 'C';
            case 13:return 'D';
            case 14:return 'E';
            case 15:return 'F';
            default:return (char) (number+'0');
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), m =0;
        long sum=0;
        // 输入的时候把大写变小写
        String n = scanner.next().toLowerCase();
        int b = scanner.nextInt();
        int[] numbern = new int[n.length()+1];
        int[] numbers = new int[1000000];
        for (int i= 0 ; i <n.length(); i++){
            numbern[i] = panduan( n.charAt(n.length()-i-1));
        }
        //任何进制先转换成10进制，乘以自己权n的次方
        for (int i = 0; i< numbern.length; i++){
            sum += numbern[i]*(int)(Math.pow(a,i));
        }
        if (sum == 0){
            System.out.println(sum);
            System.exit(0);
        }
        while (sum!=0){
            numbers[m++] = (int) (sum%b);
            sum = sum/b;
        }
        for (int i = m-1; i>=0; i--){
            System.out.print(panduans(numbers[i]));
        }
    }
}
