package NOIGo.b1.b111;

// 二分
import java.util.Scanner;
public class b06 {
    //  开销值,
    static boolean find(int mind, int[] number, int m){
        int count = 0;
        int sum = 0;
        for(int i = 0; i<number.length;i++){
            if (sum+number[i]>mind){
                sum = number[i];
                count++;
            }else {
                sum += number[i];
            }
        }
        if (sum <=mind){
            count++;
        }
        if (count>m){
            return true; // 值小了
        }else {
            return false; // 值大了
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0 ;i < n; i++)
            number[i] = scanner.nextInt();
        int sum = 0;
        int max = 0;
//        System.out.println(find(2100,number,m));
        for (int i = 0; i < n; i++){
            max = Math.max(max,number[i]);
            sum +=number[i];
        }
        int center = 0;
        int ans = 0;
        while (max<=sum){
            center = max + (sum - max)/2;
            if (find(center,number,m)){
                max = center+1;
            }
            else {
                ans = center;
                sum = center-1;
            }
        }
        System.out.println(center);
//        System.out.println(ans);
    }
}
