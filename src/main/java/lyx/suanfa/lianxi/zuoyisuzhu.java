package lyx.suanfa.lianxi;

/**
 * @Title zuoyisuzhu
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 11:25
 */
public class zuoyisuzhu {
//    题目描述
//
//    汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
//    就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
//    例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？
//
//    解题思路
//
//    很简单的题，在第 n 个字符后面将切一刀，将字符串分为两部分，再重新并接起来即可。
//    注意字符串长度为 0 的情况。
    public static String zuoyi1(String s,int k){
        int len=s.length();
        if (len==0){
            return "";
        }
        String s1=s.substring(k,len);
        String s2=s.substring(0,k);
        return s1+s2;
    }
    public static String zuoyi2(String s,int k){
        String s1=swap(s,0,k);
        String s2=swap(s,k,s.length());
        String ss = swap(s1+s2, 0, s.length());
        return ss;
    }
    public static String swap(String s,int start,int end){
        String l="";
        for (int i=end-1;i>=start;i--){
            l=l+s.charAt(i);
        }
        return l;
    }
}
