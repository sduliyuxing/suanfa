package lyx.suanfa.lianxi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Title zuixiaodekgeshu
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 15:26
 */
public class zuixiaodekgeshu {
//    题目描述
//
//    输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8
//    这8个数字，则最小的4个数字是1,2,3,4。
//
//    解题思路
//
//    两种方法：
//
//    法1：先对数组排序，然后取出前k个
//    法2：利用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆。
    public static ArrayList<Integer> getmink(int a[],int k){
        ArrayList<Integer> list=new ArrayList<>();
        if (k>a.length||k<=0||a.length<=0){
            return null;
        }
//        PriorityQueue<Integer> maxheap=new PriorityQueue<>();小根堆
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }        //容量为k的大根堆
        });
        for (int i=0;i<a.length;i++){
            if (maxheap.size()!=k){
                maxheap.offer(a[i]);
            }
            else {
                if (maxheap.peek()>a[i]){ //peek()  获取但不移除此队列的头；如果此队列为空，则返回 null。
                    maxheap.poll();//poll()     获取并移除此队列的头，如果此队列为空，则返回 null
                    maxheap.offer(a[i]);//offer(E e)           将指定的元素插入此优先级队列。
                }
            }
        }
        for (Integer n:maxheap){
            list.add(n);
        }
        return list;
    }

}
