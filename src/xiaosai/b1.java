package xiaosai;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 18:01
 */
public class b1 {
    public static void main(String[] args){
        int sum = 1;
        for(int i = 3 ; i <10000 ; i++){
            int k = 1;
            for(int j = 2 ; j < i ; j++){
                if(i%j == 0){
                    k = 0;
                    break;
                }
            }
            if(k == 1){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println("============");
        System.out.println(sum);
    }
}
