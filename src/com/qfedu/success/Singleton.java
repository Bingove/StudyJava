package com.qfedu.success;

/**
 * @Author Bingove
 * @Date 2018/8/10 0010 下午 18:29
 */
public class Singleton {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

   /* @Override
    public String toString() {
        return "Singleton{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Singleton(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private static Singleton singleton;

    //私有化构造函数
    private Singleton() {
    }

    public static Singleton getInstance(int id, String name) {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton(id, name);
                }
            }
        }
        return singleton;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class A {
    private int id;
    private String name;

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(1,"张三");
        System.out.println(singleton);//com.qfedu.success.Singleton@1540e19d
    }
}

class B {
    private int id;
    private String name;

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(1,"张三");
        System.out.println(singleton);//com.qfedu.success.Singleton@1540e19d
    }
}
