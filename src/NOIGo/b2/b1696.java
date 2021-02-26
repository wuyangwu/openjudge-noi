package NOIGo.b2;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/7 22:46
 */
public class b1696 {
    static Scanner scanner = new Scanner(System.in);
    static double digui(){
        String x = scanner.next();
        switch (x.charAt(0)){
            case '*':return digui()*digui();
            case '+':return digui()+digui();
            case '-':return digui()-digui();
            case '/':return digui()/digui();
        }
        return Double.parseDouble(x);
    }
    public static void main(String[] args){
        System.out.println(String.format("%.6f",digui()));
    }
}
