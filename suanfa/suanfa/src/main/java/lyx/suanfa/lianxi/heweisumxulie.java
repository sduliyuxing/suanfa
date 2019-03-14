package lyx.suanfa.lianxi;

import java.util.ArrayList;

/**
 * @Title heweisumxulie
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 11:11
 */
public class heweisumxulie {

//    题目描述
//
//    小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
//    但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
//    没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
//    现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
//
//    解题思路
//
//    滑动窗口的方法：用两个数字 start 和 end 分别表示序列的最小值和最大值，
//    首先将 start 初始化为1，end 初始化为2。如果从start到end的和大于sum，
//    我们就从序列中去掉较小的值(即增大start),
//    相反，只需要增大end。
//    终止条件为：一直增加begin到(1+sum)/2并且end小于sum为止

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
