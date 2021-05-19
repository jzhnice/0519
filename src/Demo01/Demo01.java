package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-19 08:01
 */
public class Demo01  extends  Thread {
    public Demo01() {

    }
    public Demo01 (String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("这是一个新的线程，自己实现的");
        System.out.println("名字："+Thread.currentThread().getName());

    }
}