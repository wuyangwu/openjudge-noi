package NOIGo.b1.b110;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class student implements Comparable<student>{
     int number;
     double score;
    public student(int number, double score){
        this.number = number;
        this.score = score;
    }
    @Override
    public int compareTo(student student) {
        return (int)(this.score)- (int)(student.score);
    }
}
public class b01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        student students[] = new student[n];
        for (int i = 0 ; i < n; i++){
            students[i] = new student(scanner.nextInt(),scanner.nextDouble());
        }
        Arrays.sort(students,0,n,Collections.reverseOrder());
        // 可以去掉多余的0
        System.out.println(students[k-1].number+" "+new BigDecimal(String.valueOf(students[k-1].score)).stripTrailingZeros().toString());
    }
}
