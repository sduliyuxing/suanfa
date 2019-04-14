package lyx.suanfa.factory;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
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
