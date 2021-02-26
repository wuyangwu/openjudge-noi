package NOIGo.b1.b110;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/27 15:35
 */

class students implements Comparable<students> {
    int no = 0;
    int number = 0 ;
    public students(int no , int number){
        this.no = no;
        this.number = number;
    }
    @Override
    public int compareTo(students students) {
        if (this.number-students.number==0){
            return students.no-this.no;
        }
        return this.number-students.number;
    }
}
public class b05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 参赛选手
        int m = scanner.nextInt(); // 志愿者人数
        m = (int) (m *1.5);
        students students[] = new students[n];
        for (int i = 0 ; i < n ; i++){
            students[i] = new students(scanner.nextInt(),scanner.nextInt());
        }
        Arrays.sort(students,0,n, Collections.reverseOrder());
        int want = m;
        for (int i =m ; i < n;i++){
            if (students[m-1].number == students[i].number){
                want++;
            }
        }
        System.out.println(students[m-1].number+" "+want);
        for (int i = 0 ; i <want ; i++){
            System.out.println(students[i].no+" "+students[i].number);
        }

    }
}
