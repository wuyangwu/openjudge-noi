package NOIGo.b1.b110;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/27 15:20
 */
public class b012 {
    public static void main(String[] args){
        double num = 123.45000;
        System.out.print(String.format("%f %n", num)); // 123.456790
        System.out.print(String.format("%a %n", num)); // 0x1.edd3c0bb46929p6
        System.out.print(String.format("%1.30f", num)); // 123.457
    }
}
