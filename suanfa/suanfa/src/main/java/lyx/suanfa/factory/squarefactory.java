package lyx.suanfa.factory;

/**
 * @Title squarefactory
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:40
 */
public class squarefactory implements createfactory{

    @Override
    public shape create() {
        return new square();
    }
}
