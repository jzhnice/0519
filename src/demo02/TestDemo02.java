package demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 08:41
 */
public class TestDemo02 {


    public static void main(String[] args) {
Demo02 demo02 = new Demo02();
Thread thread = new Thread(demo02);
thread.start();
    }
}