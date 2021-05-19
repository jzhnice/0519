package Demo04;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 10:04
 */
public class TestDemo4 {
    public static void main(String[] args) {
       Runnable r= new Runnable() {


            @Override
            public void run() {
                synchronized (this){

                    System.out.println(
                            "窗口" + Thread.currentThread().getName() + "卖出一张票，还剩:" + (--TickerContent.count)
                    );
                }
            }
        };
       new Thread(r,"1").start();
       new Thread(r,"2").start();
       new Thread(r,"3").start();
       new Thread(r,"4").start();
       new Thread(r,"5").start();
       new Thread(r,"6").start();
    }
}
