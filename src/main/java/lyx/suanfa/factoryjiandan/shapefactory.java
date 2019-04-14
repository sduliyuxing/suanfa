package lyx.suanfa.factoryjiandan;

/**
 * @Title squarefactory
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
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
