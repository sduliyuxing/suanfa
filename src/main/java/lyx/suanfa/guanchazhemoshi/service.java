package lyx.suanfa.guanchazhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title service
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:00
 */
public class service implements beiguanchazhe {

    private String message;
    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<guanchazhe> list=new ArrayList<>();

    @Override
    public void add(guanchazhe obj) {
         list.add(obj);
    }

    @Override
    public void remove(guanchazhe obj) {
       list.remove(obj);
    }

    @Override
    public void send(String message) {
        this.message=message;
        System.out.println("更新消息："+message);
        for (int i=0;i<list.size();i++){
            guanchazhe client=list.get(i);
            client.update(message);
        }
    }
}
