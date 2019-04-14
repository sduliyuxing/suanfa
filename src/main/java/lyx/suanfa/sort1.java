package lyx.suanfa;

/**
 * @Title sort1    ð�� ѡ�� ���� ��������
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\14 0014 11:14
 */

public class sort1 {

//    ð������
//    �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
//    ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԣ�����������Ԫ��Ӧ�û�����������
//    ������е�Ԫ���ظ����ϵĲ��裬�������һ����
//    �ظ�����1~3��ֱ��������ɡ�
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
//    ð������2
//    Ҫʹ�㷨������������O(n)���Ӷȣ���Ҫ��һЩ�Ľ�������һ��swap�ı�־��
//    ��ǰһ��û�н��н���ʱ��˵�������Ѿ�����û�б�Ҫ�ٽ�����һ�ֵ�ѭ���ˣ�ֱ���˳���
    public static void maopao2(int[] arr) {
        int temp = 0;
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) { // ÿ����Ҫ����ĳ���
            swap=false;
            for (int j = 0; j < i; j++) { // �ӵ�һ��Ԫ�ص���i��Ԫ��
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


//    ѡ������
//    ��δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ��
//    ��ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��
//    �ظ��ڶ�����ֱ������Ԫ�ؾ�������ϡ�
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

//    ��������
//    �Ѵ����������ֳ��������δ���������֣���ʼ��ʱ��ѵ�һ��Ԫ����Ϊ�����ź���ġ�
//    �ӵڶ���Ԫ�ؿ�ʼ�������ź������������Ѱ�ҵ���Ԫ�غ��ʵ�λ�ò������λ�á�
//    �ظ���������ֱ�����һ��Ԫ�ر����������������С�
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

//     ���ֲ���
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
