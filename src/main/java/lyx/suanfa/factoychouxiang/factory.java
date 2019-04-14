package lyx.suanfa.factoychouxiang;

/**
 * @Title factory
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
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
