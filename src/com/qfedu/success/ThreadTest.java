package com.qfedu.success;

import java.io.IOException;

/**
 * @Author Bingove
 * @Date 2018/8/10 0010 下午 19:00
 */
public class ThreadTest implements Runnable {
    private Object flag;
    private String name;

    public ThreadTest(Object flag, String name) {
        this.flag = flag;
        this.name = name;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("线程 " + name + "---" + flag + " ----->" + i);
                synchronized (this.flag) {
                    if (i == 3) {
                        flag.wait();
                        System.out.println("调用了wait方法-----》》》");
                    }

                }
            }
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MainTest {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest("1", "厉害");
        Thread thread = new Thread(threadTest);
        thread.start();
    }
}

class ThreadTe implements Runnable {
    private Object object;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程二---------" + i);
            if (i == 6) {

            }
        }
    }
}
