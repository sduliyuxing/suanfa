package lyx.suanfa.singleton;

/**
 * @Title singleton1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:39
 */
public class singleton1 {

//    懒汉式，线程不安全
//    是否 Lazy 初始化：是
//    是否多线程安全：否
//    实现难度：易
//    描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
//    这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。

    private static singleton1 instance;
    private singleton1(){

    }
    public static singleton1 getInstance(){
        if (instance==null){
            instance=new singleton1();
        }
        return instance;
    }
}
