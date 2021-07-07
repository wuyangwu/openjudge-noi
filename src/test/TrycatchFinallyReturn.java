package test;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 10:25
 *
 * 测试try catch 返回问题
 */
public class TrycatchFinallyReturn {

    /*
    *
    * 看到上面程序中finally块已经执行了，而且程序执行finally块时已经把x变量增加到2了。但test()方法返回的依然是1，这就是由return语句执行流程决定的，
    * Java会把return语句先执行完、把所有需要处理的东西都先处理完成，需要返回的值也都准备好之后，但是还未返回之前，程序流程会转去执行finally块，但此时
    * finally块中的对x变量的修改已经不会影响return要返回的值了。
     *
    * */
    static int x(){
        int x = 1;
        try{
            return x;
        }finally {
                ++x;
        }
    }

    static int y(){
        int x = 1;
        try{
            return x;
        }finally {
            return ++x;
        }
    }
    public static void main(String[] args) {
        System.out.println(x());
        System.out.println(y());
    }
}
