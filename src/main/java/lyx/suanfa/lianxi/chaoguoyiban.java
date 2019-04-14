package lyx.suanfa.lianxi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title chaoguoyiban
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 14:58
 */
public class chaoguoyiban {
//    题目描述
//
//    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
//    例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
//    超过数组长度的一半，因此输出2。如果不存在则输出0。
//
//    解题思路
//
//    三种解法：
//
//    法1：借助hashmap存储数组中每个数出现的次数，最后看是否有数字出现次数超过数组长度的一半；
//    法2：排序。数组排序后，如果某个数字出现次数超过数组的长度的一半，则一定会数组中间的位置。
//    所以我们取出排序后中间位置的数，统计一下它的出现次数是否大于数组长度的一半；
//    法3：某个数字出现的次数大于数组长度的一半，意思就是它出现的次数比其他所有数字出现的次数和
//    还要多。因此我们可以在遍历数组的时候记录两个值：1. 数组中的数字;2. 次数。遍历下一个数字时，
//    若它与之前保存的数字相同，则次数加1，否则次数减1；若次数为0，则保存下一个数字，并将次数置为1。
//    遍历结束后，所保存的数字即为所求。最后再判断它是否符合条件。
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
