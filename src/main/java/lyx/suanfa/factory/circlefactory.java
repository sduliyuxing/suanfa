package lyx.suanfa.factory;

/**
 * @Title circlefactory
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
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
