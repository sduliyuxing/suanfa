package lyx.suanfa.lianxi;

import java.util.ArrayList;

/**
 * @Title heweisumxulie
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 11:11
 */
public class heweisumxulie {

//    ��Ŀ����
//
//    С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
//    ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
//    û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
//    ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
//
//    ����˼·
//
//    �������ڵķ��������������� start �� end �ֱ��ʾ���е���Сֵ�����ֵ��
//    ���Ƚ� start ��ʼ��Ϊ1��end ��ʼ��Ϊ2�������start��end�ĺʹ���sum��
//    ���Ǿʹ�������ȥ����С��ֵ(������start),
//    �෴��ֻ��Ҫ����end��
//    ��ֹ����Ϊ��һֱ����begin��(1+sum)/2����endС��sumΪֹ

    public static  ArrayList<ArrayList<Integer>> lists=new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> heweisum(int a[], int sum){
        if (sum<3){
            return lists;
        }
        int start=1,end=2,mid=(1+sum)/2,s=0;
        while (start<mid){
            s=sum(a,start,end);
            if (s==sum){
                lists.add(getlist(a,start,end));
                end++;
            }
            else if (s<sum){
                end++;
            }else {
                start++;
            }
        }
        return lists;
    }

    public static int sum(int a[],int start,int end){
       int sum=0;
       for (int i=start;i<=end;i++){
           sum+=a[i];
       }
       return sum;
    }

    public static ArrayList<Integer> getlist(int a[],int start,int end){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=start;i<=end;i++){
            list.add(a[i]);
        }
        return list;
    }
}
