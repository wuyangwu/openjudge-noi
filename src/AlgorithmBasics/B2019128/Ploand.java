package AlgorithmBasics.B2019128;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/8 16:44  逆波兰法 中缀法 （2+3）*（5+7）+9/3
 *
 */
public class Ploand {

    static int n = 0;

    static String number;

    // 表达式
    public static int factorValue(){
        // 获取第一个项的值
        boolean more = true;
        int result = termValue();
        while (more&&n<number.length()){
            char b = number.charAt(n);
            if( b == '+' || b == '-'){
                n++;
                int c = termValue();
                if( b == '+')
                    result = result+c;
                else  result -= c;
            }else {
                more = false;
            }
        }
        return result;
    }

    // 项
    public static int termValue(){
        // 获取第一个因子的值
        int result = expressionValue();
        boolean more = true;
        while (more&&n<number.length()){
            char b = number.charAt(n);
            if(b == '*' || b == '/'){
                n++;
                // 获取第二个因子的值
                int c = expressionValue();
                if(b == '*')
                    result *= c;
                else result /=c;
            }else {
                more = false;
            }
        }
        return result;
    }

    //因子
    public static int expressionValue(){
        int reselt = 0;
        // 读取number的第一个值
        char a = number.charAt(n);
        if(a == '('){
            ++n;
            // 获取表达式的值
             reselt = factorValue();
            ++n;
        }else {
            // Character.isDigit是用来判断字符串是否是数字
            while (Character.isDigit(a)){
                reselt = reselt*10 + a-'0';
                if((++n) < number.length()){
                    a = number.charAt(n);
                }else {
                    n--;
                    break;
                }

            }

        }

        return reselt;
    }

    public static void main(String[] args){
        System.getProperty("user.home");
        System.out.println(System.getProperty("user.home"));
        Scanner scanner = new Scanner(System.in);
        number = scanner.next();
        System.out.println(factorValue());
    }
}
