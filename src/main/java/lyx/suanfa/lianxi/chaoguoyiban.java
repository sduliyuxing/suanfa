package lyx.suanfa.lianxi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title chaoguoyiban
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 14:58
 */
public class chaoguoyiban {
//    ��Ŀ����
//
//    ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
//    ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
//    �������鳤�ȵ�һ�룬������2����������������0��
//
//    ����˼·
//
//    ���ֽⷨ��
//
//    ��1������hashmap�洢������ÿ�������ֵĴ���������Ƿ������ֳ��ִ����������鳤�ȵ�һ�룻
//    ��2������������������ĳ�����ֳ��ִ�����������ĳ��ȵ�һ�룬��һ���������м��λ�á�
//    ��������ȡ��������м�λ�õ�����ͳ��һ�����ĳ��ִ����Ƿ�������鳤�ȵ�һ�룻
//    ��3��ĳ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬��˼���������ֵĴ����������������ֳ��ֵĴ�����
//    ��Ҫ�ࡣ������ǿ����ڱ��������ʱ���¼����ֵ��1. �����е�����;2. ������������һ������ʱ��
//    ������֮ǰ�����������ͬ���������1�����������1��������Ϊ0���򱣴���һ�����֣�����������Ϊ1��
//    ��������������������ּ�Ϊ����������ж����Ƿ����������
    public static int dayu1(int a[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else {
                map.put(a[i],map.get(a[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry :map.entrySet()){
            if (entry.getValue()*2>a.length){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static int dayu2(int a[]){
        Arrays.sort(a);
        int t=a.length/2;
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==a[t]){
                count++;
            }
        }
        if (count>t){
            return a[t];
        }
        return 0;
    }

    public static int dayu3(int a[]){
        int count=1,temp=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]==temp){
                count++;
            }
            else count--;
            if (count==0){
                temp=a[i];
                count=1;
            }
        }
        count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==temp){
               count++;
            }
        }
        if (count*2>a.length){
            return temp;
        }
        return 0;
    }

}
