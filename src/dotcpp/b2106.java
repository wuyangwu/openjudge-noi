package dotcpp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 14:21
 */
class Migo{
    int x ,y ;
    Migo(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class b2106 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int n = 0;
            while ((n = scanner.nextInt())!=0){
                Migo[] number = new Migo[n+1];
                int x=0,y=0;
                int[]  biaoji = new int[n+1];
                for (int i = 1; i<=n;i++){
                    number[i] = new Migo(x=scanner.nextInt(),y=scanner.nextInt());
                }
                int p = scanner.nextInt();
                Queue<Migo> queue = new LinkedList<>();
                queue.add(new Migo(number[p].x,number[p].y));
                biaoji[number[p].x] = 1;
                while (!queue.isEmpty()){
                    Migo migo = queue.peek(); // 只读不拿
                    if (biaoji[migo.y]==1){
                        System.out.println("No");
                        break;
                    }
                    for (int i =1 ;i <=n;i++){
                        if (number[i].x==migo.y){
                            biaoji[number[i].x] = 1;
                            queue.add(new Migo(number[i].x,number[i].y));
                        }
                    }
                    queue.poll(); // 丢弃
                }
                if (queue.isEmpty()){ //为空执行
                	System.out.println(queue.isEmpty());
                    System.out.println("Yes");
                }
            }

    }
}
