package lyx.suanfa.factory;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 11:10
 */
public class test {

    @Test
    public void test(){
        createfactory createfactory;
        createfactory=new circlefactory();
        circle circle= (circle)createfactory.create();
        circle.draw();
        createfactory=new squarefactory();
        square square=(square)createfactory.create();
        square.draw();
    }
}
