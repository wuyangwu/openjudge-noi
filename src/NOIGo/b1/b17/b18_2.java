package NOIGo.b1.b17;

import java.util.Scanner;

public class b18_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String  m = scanner.nextLine();
        String  n = scanner.nextLine();
        int max = Math.max(m.length(),n.length());
        int min = Math.min(m.length(),n.length());
        if (m.length()<n.length()){
            String s = m;
            m = n;
            n =s;
        }
        int i =0;
        int j = 0;
        if (m.length()!=n.length()&&m.length()>0&&n.length()>0){
            while (i<max&&j<min){
                if (m.charAt(i )!= n.charAt(j++)){ //只要考虑 遇到不同的时候子字符串退到0的下表 父字符串保持不动，就可
                    if(j!=1){
                        i--;
                    }
                    j =0;
                }
            }
            if (j == min){
                System.out.println(n+" is substring of "+m);
            }else {
                System.out.println("No substring");
            }
        }else {
            while (i<max&&j<min){
                if (m.charAt(i++) != n.charAt(j++)){
                    break;
                }
            }
            if (i == max&&j==min)
                System.out.println(n+" is substring of "+m);
            else System.out.println("No substring");
        }
    }
}
