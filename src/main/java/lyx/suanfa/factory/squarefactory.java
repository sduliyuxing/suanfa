package lyx.suanfa.factory;

/**
 * @Title squarefactory
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
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
