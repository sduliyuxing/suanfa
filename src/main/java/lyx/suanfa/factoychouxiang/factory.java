package lyx.suanfa.factoychouxiang;

/**
 * @Title factory
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:54
 */
public class factory {

    public abstractfactory getfactory(String type){
        if (type.equals("color")){
            return new colorfactory();
        }else if (type.equals("shape")){
            return new shapefactory();
        }else return null;
    }
}
