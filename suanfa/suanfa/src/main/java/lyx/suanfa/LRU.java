package lyx.suanfa;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Title LRU
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 9:01
 */
public class LRU {

//    ˼·��
//    ˫�������hashmap��
//            1.����Ҫ�����µ��������ʱ��������������������д��ڣ�һ���Ϊ���У���
//    ��Ѹýڵ��Ƶ�����ͷ����
//    ��������ڣ����½�һ���ڵ㣬�ŵ�����ͷ��
//    ���������ˣ�����������һ���ڵ�ɾ�����ɡ�
//            2.�ڷ������ݵ�ʱ������������������д��ڣ���Ѹýڵ��Ƶ�����ͷ�������򷵻�-1��
//    ����һ��������β���Ľڵ����������δ���ʵ������
    private Integer capacity;
    private LinkedList<Integer> list;
    private HashMap<Integer,Integer> hashMap;

    public void init(Integer capacity){
          this.capacity=capacity;
          list=new LinkedList<>();
          hashMap=new HashMap<>();
      }

    public int get(Integer key){
        if (hashMap.containsKey(key)){
            list.removeFirstOccurrence(key);
            list.addFirst(key);
            return hashMap.get(key);
        } else {
            return -1;
        }
      }

    public boolean put(Integer key){
        if (!hashMap.containsKey(key)){
            if (list.size()==capacity){
                Integer t=list.removeLast();
                hashMap.remove(t);
            }
            list.addFirst(key);
            hashMap.put(key,key);
            return true;
        }else {
            list.removeFirstOccurrence(key);
            list.addFirst(key);
            return true;
        }
      }

    @Test
    public void test(){
        LRU lru=new LRU();
        lru.init(4);
        lru.put(1);
        lru.put(2);
        lru.put(3);
        lru.put(4);
        lru.put(5);
        lru.put(6);
        System.out.println(lru.list);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.list);
    }


}
