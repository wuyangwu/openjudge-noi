package dotcpp;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 10:24
 */
import java.util.Scanner;
public class b1004 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        while((n=sc.nextInt())!=0) {
            System.out.println(giveBirth(n));
        }
    }
    public static int giveBirth(int year){
        if(year<=4) return year;
        else{
            return giveBirth(year-1)+giveBirth(year-3);
        }
    }
}