package p3;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by ZJYYY on 2018/4/6.
 */
public class T {

    private int count = 10;

    public synchronized void m() {//等同于在方法的代码执行时要synchronized(this)
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
}
