package lyx.suanfa.lianxi;

/**
 * @Title zifuchuanzhuanhuan
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 14:25
 */
public class zifuchuanzhuanhuan {


//    题目描述
//
//    将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
//    但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
//    数值为0或者字符串不是一个合法的数值则返回0。
//
//    解题思路
//
//    常规思路，先判断第一位是不是符号位，如果有符号，有flag 做标记。
//    遍历字符串中的每个字符，如果存在非数字的字符，直接返回 0，否则，
//    用当前字符减去’0’得到当前的数字，再进行运算。
    public static long zhuanhuan(String s){
        if (s.length()==0){
            return 0;
        }
        int flag=0,start=0;
        if (s.charAt(0)=='+') {
             flag=1;
        }else if (s.charAt(0)=='-'){
            flag=2;
        }
        if (flag>0){
           start=1;
        }
        Long t=0l;
        while (start<s.length()){
            if (s.charAt(start)>'9'||s.charAt(start)<'0'){
                return 0;
            }
            t=t*10+s.charAt(start)-'0';
            start++;
        }
        return t;
    }
}
