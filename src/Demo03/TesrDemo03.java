package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 09:26
 */
public class TesrDemo03 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("进入主线程"+Thread.currentThread().getName());
        DaemonThread demoThread = new DaemonThread();

        Thread thread = new Thread(demoThread);
        thread.setDaemon(true);

        thread.start();

        Thread.sleep(500);
        System.out.println("你好，世界");
        System.out.println("退出主线程" +Thread.currentThread().getName());
    }
}
