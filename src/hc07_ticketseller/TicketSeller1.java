package hc07_ticketseller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZJYYY on 2018/4/7.
 * <p>
 * 有N张火车票，每张票都有一个编号
 * 同时又10个窗口对外售票
 * 请写一个程序
 * <p>
 * 下面的程序会有哪些问题：重复售票，超量销售
 */
public class TicketSeller1 {
    static List<String> tickets = new ArrayList<>();

    static {
        for (int i = 0; i < 10000; i++) tickets.add("票编号： " + i);
    }

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            new Thread(()->{
                while(tickets.size()>0) {
                    System.out.println("销售了--"+tickets.remove(0));
                }
            }).start();
        }
    }
}
