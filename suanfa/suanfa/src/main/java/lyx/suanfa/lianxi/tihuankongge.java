package lyx.suanfa.lianxi;

/**
 * @Title tihuankongge   空格替换
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 17:26
 */
public class tihuankongge {


//    题目描述
//
//    请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
//            则经过替换之后的字符串为We%20Are%20Happy。
//
//    解题思路
//
//    很简单，从后往前遍历就对了。

    public String replace(StringBuffer str){
        StringBuffer res=new StringBuffer();
        for (int i=str.length();i>=0;i--){
            if (str.charAt(i)==' '){
                res.append("02%"); //添加
            }
            else {
                res.append(str.charAt(i));
            }
        }
        return res.reverse().toString(); //将此字符序列用其反转形式取代。
    }
}
