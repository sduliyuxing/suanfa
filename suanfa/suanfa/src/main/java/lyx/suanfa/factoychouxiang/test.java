package lyx.suanfa.factoychouxiang;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:56
 */
public class test {

    @Test
    public void test(){
      factory factory=new factory();
      abstractfactory factory1=factory.getfactory("color");
      color color1=factory1.getcolor("red");
      color1.fill();
      color color2=factory1.getcolor("yellow");
      color2.fill();
      abstractfactory factory2=factory.getfactory("shape");
      shape shape1=factory2.getshape("square");
      shape1.draw();
      shape shape2=factory2.getshape("circle");
      shape2.draw();
    }
}
