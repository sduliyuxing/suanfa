package lyx.suanfa.lianxi;

/**
 * @Title zifuchuanzhuanhuan
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 14:25
 */
public class zifuchuanzhuanhuan {


//    ��Ŀ����
//
//    ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�
//    ����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯����
//    ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
//
//    ����˼·
//
//    ����˼·�����жϵ�һλ�ǲ��Ƿ���λ������з��ţ���flag ����ǡ�
//    �����ַ����е�ÿ���ַ���������ڷ����ֵ��ַ���ֱ�ӷ��� 0������
//    �õ�ǰ�ַ���ȥ��0���õ���ǰ�����֣��ٽ������㡣
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
