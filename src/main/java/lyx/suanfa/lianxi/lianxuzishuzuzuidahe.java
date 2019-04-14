package lyx.suanfa.lianxi;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Title lianxuzishuzuzuidahe
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 15:46
 */
public class lianxuzishuzuzuidahe {

    public static HashMap<Integer,ArrayList> findhe(int a[]){
        if (a.length==0){
            return null;
        }
        int sum=a[0],max=a[0];
        int left=0,right=0;
        ArrayList list=new ArrayList();
        for (int i=1;i<a.length;i++){
            if (sum>0){
                sum=sum+a[i];
            }
            else {
                sum=a[i];
                left=i;
            }
            if (max<sum){
                max=sum;
                right=i;
            }
        }
        while (left<=right){
           list.add(a[left++]);
        }
        HashMap<Integer,ArrayList>map=new HashMap<>();
        map.put(sum,list);
        return map;
    }
}
