package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 09:26
 */
public class DaemonThread implements Runnable{

    @Override
    public void run() {
        System.out.println("进入守护线程"+Thread.currentThread().getName());
        System.out.println("守护线程开工6");
        writeTofile();
        System.out.println("退出守护线程"+Thread.currentThread().getName());
}
private void writeTofile() {
    int count = 0;
    while (count < 999){
        System.out.println("守护线程"+Thread.currentThread().getName()+count);
        count++;
    }
}
}
