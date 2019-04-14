package lyx.suanfa.factoryjiandan;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:42
 */
public class test {

    @Test
    public void test(){
        shapefactory factory=new shapefactory();
        shape shape1=factory.getshape("square");
        shape1.draw();
        shape shape2=factory.getshape("circle");
        shape2.draw();
    }
}
