package lyx.suanfa.singleton;

/**
 * @Title singleton2
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:47
 */
public class singleton2 {

//    懒汉式，线程安全
//    是否 Lazy 初始化：是
//    是否多线程安全：是
//    实现难度：易
//    描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
//    优点：第一次调用才初始化，避免内存浪费。
//    缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。

    private static singleton2 instance;

    private singleton2(){

    }

    public static synchronized singleton2 getinstance(){
      if (instance==null){
          instance=new singleton2();
      }
      return instance;
    }
}
