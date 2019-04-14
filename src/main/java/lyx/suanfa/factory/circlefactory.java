package lyx.suanfa.factory;

/**
 * @Title circlefactory
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 11:09
 */
public class circlefactory implements createfactory {

    @Override
    public shape create() {
        return new circle();
    }
}
