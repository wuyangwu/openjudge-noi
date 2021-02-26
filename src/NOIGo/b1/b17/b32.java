package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/25 20:00
 */
public class b32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        int i = 0,j=1,count = 1;
        while (i<m.length()&&j<m.length()){
//            System.out.println(m.substring(j,j+1)+" "+m.substring(i,i+1));
            if (m.substring(j,j+1).compareToIgnoreCase(m.substring(i,i+1))!=0){ //
                if(m.charAt(i)>=97&&m.charAt(i)<=122){
                    System.out.print("("+(char)(m.charAt(i)-32)+","+(j-i)+")");
                }else {
                    System.out.print("("+m.charAt(i)+","+(j-i)+")");
                }

                i = j++;
            }else {
                j++;
            }
        }
        if(m.charAt(i)>=97&&m.charAt(i)<=122){
            System.out.print("("+(char)(m.charAt(i)-32)+","+(j-i)+")");
        }else {
            System.out.print("("+m.charAt(i)+","+(j-i)+")");
        }
    }
}
