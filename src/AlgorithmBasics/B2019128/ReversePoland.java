package AlgorithmBasics.B2019128;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/8 16:13  波兰  *+235 = (2+3)*5 前缀法
 */
public class ReversePoland {

    public static double excp(){
        char s[] = new char[100];
        Scanner scanner = new Scanner(System.in);
        s[0] = scanner.next().charAt(0);
        switch (s[0]){
            case '+' : return excp()+excp();
            case '-' : return excp()-excp();
            case '*' : return excp()*excp();
            case '/' : return excp()/excp();
            default: return Double.parseDouble(String.valueOf(s[0]));
        }
    }

    public static void main(String[] args){
        System.out.println(excp());
    }
}
