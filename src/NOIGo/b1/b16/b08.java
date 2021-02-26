package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 15:49
 */
public class b08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int na = scanner.nextInt();
        int nb = scanner.nextInt();
        int ia = 0;
        int ib = 0;
        char[] naa = new char[na];
        char[] nbb = new char[nb];
        int[] numbera = new int[n];
        int[] numberb = new int[n];
        for (int i = 0 ; i < na ; i++){
            naa[i] = scanner.next().charAt(0);
        }
        for (int i = 0 ; i < nb ; i++){
            nbb[i] = scanner.next().charAt(0);
        }
        int suma = 0;
        int sumb = 0;
        for (int i = 0 ;i < n ; i++){
            if(i%na == 0){
                ia = 0;
            }
            if (i%nb == 0){
                ib = 0;
            }
            numbera[i] = naa[ia] - '0';
            numberb[i] = nbb[ib] - '0';
            ia++;ib++;
        }
        for (int i = 0 ; i < n; i++){
            if(numbera[i] != numberb[i]){
                switch (numbera[i]){
                    case 0:
                        if(numberb[i] == 5){
                            if(numbera[i]<numberb[i])
                                sumb++;
                            else suma++;
                        }else {
                            if(numbera[i]<numberb[i])
                                suma++;
                            else sumb++;
                        }
                        break;
                    case 2:
                          if(numbera[i] < numberb[i])
                                suma++;
                            else sumb++;
                        break;
                    case 5:
                        if(numberb[i] == 2){
                            if(numbera[i] > numberb[i])
                                sumb++;
                            else suma++;
                        }else {
                            if(numbera[i] > numberb[i])
                                suma++;
                            else sumb++;
                        }
                        break;
                }
            }
        }
        if(suma == sumb){
            System.out.println("draw");
        }else {
            if(suma > sumb){
                System.out.println("A");
            }else {
                System.out.println("B");
            }
        }
    }
}
