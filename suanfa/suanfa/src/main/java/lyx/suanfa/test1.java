package lyx.suanfa;

import org.junit.Test;

/**
 * @Title test1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\3\8 0008 17:42
 */
public class test1 {

    @Test
    public void test() {
       double x=2;
       double res=x;
       double jingdu=0.01;
       while (Math.abs(res*res-x)>jingdu){
           res=res/2+x/2/res;
       }
        System.out.println(res);
       String s=String.format("%.3f",res);
        System.out.println(s);
    }
}