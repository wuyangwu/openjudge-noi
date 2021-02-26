package com.juc1205;

import java.util.concurrent.TimeUnit;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 13:01
 *
 * 8  Lock
 * 1 标准访问，请先打印邮件还是短信
 *    先 打印邮件 后 打印短信 ,高内聚低耦合
 * 2 暂停四秒钟在邮件方法，请问先打印邮件还是先打印短信
 * **********sendEmail1
 * ************SendSMS
 * 3. 新增普通sayHello方法，请问先打印邮件还是hello
 *
 * 4.两部手机先打印邮件还是短信
 * ************SendSMS
 * **********sendEmail1
 *
 * 5.两个静态同步方法，同一部手机先打印邮件还是短信
 *
 * 6 两个静态同步方法，两部手机，请问先打印邮件还是短信
 *
 * 7 一个静态同步方法，一个普通同步方法,一部手机，请问先打印邮件还是短信
 *
 * 8一个静态同步方法，一个普通同步方法,2部手机，请问先打印邮件还是短信
 */

class Phone{
    public static synchronized  void SendEmail()throws Exception{
        TimeUnit.SECONDS.sleep(4);
        System.out.println("**********sendEmail1");
    }

    public  synchronized void SendSMS()throws Exception{
        System.out.println("************SendSMS");
    }

    public void sayhello()throws Exception{
        System.out.println("********SayHello");
    }

}



public class Lock8Demo05 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        new Thread(
                ()->{
                    try {
                        phone.SendEmail();
//                        phone.SendEmail();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ,"A"
        ).start();

        Thread.sleep(1000);

        new Thread(
                ()->{
                    try {
                        phone.SendSMS();
//                        Phone.SendSMS();
//                        phone1.SendSMS();
//                        phone.SendSMS();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ,"B"
        ).start();
    }
}

