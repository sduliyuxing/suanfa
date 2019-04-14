package lyx.suanfa.lianxi;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title zuhezuida
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 16:45
 */
public class zuhezuida {

    public static String zuida(String a[]){
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuffer buffer=new StringBuffer();
        for (int i=0;i<a.length;i++){
            buffer.append(a[i]);
        }
        return buffer.toString();
    }
}
