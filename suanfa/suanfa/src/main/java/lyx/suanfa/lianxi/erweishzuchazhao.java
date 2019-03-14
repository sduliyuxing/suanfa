package lyx.suanfa.lianxi;

/**
 * @Title erweishzuchazhao     二维数组中的查找
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 17:12
 */
public class erweishzuchazhao {
//    题目描述     1.jpg
//
//    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
//    每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//    判断数组中是否含有该整数
//
//
//    二维数组是有序的，从右上角来看，向左数字递减，向下数字递增。
//    因此从右上角开始查找，
//
//    当要查找数字比右上角数字大时，下移；
//    当要查找数字比右上角数字小时，左移；
//    如果出了边界，则说明二维数组中不存在该整数。
    public boolean find(int a[][],int target){
        if (a[0].length==0||a.length==0){
            return false;
        }
        int n=a[0].length-1,m=0;
        int temp=a[m][n];
        while (target!=temp){
            if (m>0&&n<a.length-1){
                if (target>temp){
                    m++;
                }
                else if (target<temp){
                    n--;
                }
                temp=a[m][n];
            }
            else return false;
        }
        return true;
    }
}
