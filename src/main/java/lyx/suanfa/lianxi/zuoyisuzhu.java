package lyx.suanfa.lianxi;

/**
 * @Title zuoyisuzhu
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 11:25
 */
public class zuoyisuzhu {
//    ��Ŀ����
//
//    �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
//    �������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
//    ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�
//
//    ����˼·
//
//    �ܼ򵥵��⣬�ڵ� n ���ַ����潫��һ�������ַ�����Ϊ�����֣������²����������ɡ�
//    ע���ַ�������Ϊ 0 �������
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
