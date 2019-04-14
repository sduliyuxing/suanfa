package lyx.suanfa;

/**
 * @Title sort1    冒泡 选择 插入 二分排序
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\14 0014 11:14
 */

public class sort1 {

//    冒泡排序
//    比较相邻的元素。如果第一个比第二个大，就交换它们两个；
//    对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
//    针对所有的元素重复以上的步骤，除了最后一个；
//    重复步骤1~3，直到排序完成。
    public static void maopao(int arr[]) {
        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
//    冒泡排序2
//    要使算法在最佳情况下有O(n)复杂度，需要做一些改进，增加一个swap的标志，
//    当前一轮没有进行交换时，说明数组已经有序，没有必要再进行下一轮的循环了，直接退出。
    public static void maopao2(int[] arr) {
        int temp = 0;
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) { // 每次需要排序的长度
            swap=false;
            for (int j = 0; j < i; j++) { // 从第一个元素到第i个元素
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
            }//loop j
            if (swap==false){
                break;
            }
        }//loop i
    }// method bubbleSort


//    选择排序
//    在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
//    从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
//    重复第二步，直到所有元素均排序完毕。
    public static void xuanze(int a[]){
        int temp,min;
        for (int i=0;i<a.length-1;i++){
            min=i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j]){
                    min=j;
                }
            }
            if (min!=i){
                temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
    }

//    插入排序
//    把待排序的数组分成已排序和未排序两部分，初始的时候把第一个元素认为是已排好序的。
//    从第二个元素开始，在已排好序的子数组中寻找到该元素合适的位置并插入该位置。
//    重复上述过程直到最后一个元素被插入有序子数组中。
      public static void charu(int a[]){
         for(int i=1;i<a.length;i++){
             int temp=a[i];
             int j=i;
             while (j>0&&a[j-1]>temp){
                 a[j]=a[j-1];
                 j--;
             }
             a[j]=temp;
         }
      }

//     二分查找
    public static int erfenchazhao1(int a[],int k){
        int left=0,right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (a[mid]==k){
                return mid;
            }else if (a[mid]<k){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
    public static int erfenchazhao2(int a[],int k,int left,int right){
        if (left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if (a[mid]==k){
            return mid;
        }
        else if (a[mid]>k){
            return erfenchazhao2(a,k,left,mid-1);
        }else {
            return erfenchazhao2(a,k,mid+1,right);
        }
    }
}
