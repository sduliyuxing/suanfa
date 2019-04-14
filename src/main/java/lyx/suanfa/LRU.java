package lyx.suanfa;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Title LRU
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 9:01
 */
public class LRU {

//    思路：
//    双向链表和hashmap。
//            1.当需要插入新的数据项的时候，如果新数据项在链表中存在（一般称为命中），
//    则把该节点移到链表头部，
//    如果不存在，则新建一个节点，放到链表头部
//    若缓存满了，则把链表最后一个节点删除即可。
//            2.在访问数据的时候，如果数据项在链表中存在，则把该节点移到链表头部，否则返回-1。
//    这样一来在链表尾部的节点就是最近最久未访问的数据项。
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
