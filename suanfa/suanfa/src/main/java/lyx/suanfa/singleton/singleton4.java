package lyx.suanfa.singleton;

/**
 * @Title singleton4
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:52
 */
public class singleton4 {

//    双检锁/双重校验锁（DCL，即 double-checked locking）
//    JDK 版本：JDK1.5 起
//    是否 Lazy 初始化：是
//    是否多线程安全：是
//    实现难度：较复杂
//    描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
//    getInstance() 的性能对应用程序很关键。

    private static singleton4 instance;
    private singleton4(){

    }
    public static singleton4 getinstance(){
        if (instance==null){
            synchronized (singleton4.class){
                if (instance==null){
                    instance=new singleton4();
                }
            }
        }
        return instance;
    }
}
