package lyx.suanfa.guanchazhemoshi;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:07
 */
public class test {

    @Test
    public void test(){
        service sender=new service();
        client a=new client("a");
        client b=new client("b");
        client c=new client("c");

        sender.add(a);
        sender.add(b);
        sender.add(c);

        sender.send("java�鼮");
        System.out.println("---------------");

        sender.remove(c);
        sender.send("math�鼮");
    }

}
