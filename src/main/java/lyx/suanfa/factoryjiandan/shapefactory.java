package lyx.suanfa.factoryjiandan;

/**
 * @Title squarefactory
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:40
 */
public class shapefactory {

    public shape getshape(String type){
        if (type.equals("circle")){
            return new circle();
        }else if (type.equals("square")){
            return new square();
        }else return null;
    }
}
