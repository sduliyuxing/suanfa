package lyx.suanfa.factoychouxiang;

/**
 * @Title colorfactory
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:53
 */
public class colorfactory extends abstractfactory  {
    @Override
    public color getcolor(String type) {
        if (type.equals("red")){
            return new red();
        }else if (type.equals("yellow")){
            return new yellow();
        }else return null;
    }

    @Override
    public shape getshape(String type) {
        return null;
    }
}
