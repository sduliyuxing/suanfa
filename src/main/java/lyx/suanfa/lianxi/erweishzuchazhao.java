package lyx.suanfa.lianxi;

/**
 * @Title erweishzuchazhao     ��ά�����еĲ���
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 17:12
 */
public class erweishzuchazhao {
//    ��Ŀ����     1.jpg
//
//    ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
//    ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
//    �ж��������Ƿ��и�����
//
//
//    ��ά����������ģ������Ͻ��������������ֵݼ����������ֵ�����
//    ��˴����Ͻǿ�ʼ���ң�
//
//    ��Ҫ�������ֱ����Ͻ����ִ�ʱ�����ƣ�
//    ��Ҫ�������ֱ����Ͻ�����Сʱ�����ƣ�
//    ������˱߽磬��˵����ά�����в����ڸ�������
    public boolean find(int a[][],int target){
        if (a[0].length==0||a.length==0){
            return false;
        }
        int n=a[0].length-1,m=0;
        int temp=a[m][n];
        while (target!=temp){
            if (m>0&&n<a.length-1){
                if (target>temp){
                    m++;
                }
                else if (target<temp){
                    n--;
                }
                temp=a[m][n];
            }
            else return false;
        }
        return true;
    }
}
