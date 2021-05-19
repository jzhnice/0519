package demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 08:40
 */
public class Demo02 implements  Runnable {
    @Override
    public void run() {
        System.out.println("新线程，实现接口的方式");
    }
}


/**
 * 1.实现接口
 * 2.复写run方法
 * 3.创建线程测试
 * */