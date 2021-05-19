package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 08:33
 */
public class TestDemo01 {
    public static void main(String[] args) {
        /*Demo01 demo01 = new Demo01("线程1");
        demo01.start();   // 线程的方式运行
        */


        Demo01 demo01 = new Demo01("1");
        Demo01 demo02 = new Demo01("2");
        Demo01 demo03 = new Demo01("3");
        Demo01 demo04 = new Demo01("4");


        demo01.setPriority(1);
        demo02.setPriority(3);
        demo03.setPriority(7);
        demo04.setPriority(10);






        demo01.start();
        demo02.start();
        demo03.start();
        demo04.start();


    }
}