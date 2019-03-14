package lyx.suanfa.lianxi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Title zuixiaodekgeshu
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 15:26
 */
public class zuixiaodekgeshu {
//    ��Ŀ����
//
//    ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8
//    ��8�����֣�����С��4��������1,2,3,4��
//
//    ����˼·
//
//    ���ַ�����
//
//    ��1���ȶ���������Ȼ��ȡ��ǰk��
//    ��2���������ѱ�����k������ÿ��ֻ�ͶѶ��ȣ�����ȶѶ�С��ɾ���Ѷ���������ѡ�
    public static ArrayList<Integer> getmink(int a[],int k){
        ArrayList<Integer> list=new ArrayList<>();
        if (k>a.length||k<=0||a.length<=0){
            return null;
        }
//        PriorityQueue<Integer> maxheap=new PriorityQueue<>();С����
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }        //����Ϊk�Ĵ����
        });
        for (int i=0;i<a.length;i++){
            if (maxheap.size()!=k){
                maxheap.offer(a[i]);
            }
            else {
                if (maxheap.peek()>a[i]){ //peek()  ��ȡ�����Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null��
                    maxheap.poll();//poll()     ��ȡ���Ƴ��˶��е�ͷ������˶���Ϊ�գ��򷵻� null
                    maxheap.offer(a[i]);//offer(E e)           ��ָ����Ԫ�ز�������ȼ����С�
                }
            }
        }
        for (Integer n:maxheap){
            list.add(n);
        }
        return list;
    }

}
