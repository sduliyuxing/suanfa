package lyx.suanfa;

/**
 * @Title sort2    快排 堆排 归并
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\14 0014 15:59
 */
public class sort2 {
                                                    //快排
    public static void kuaipaisuanfa(int a[]){

        int left=0,right=a.length-1;
        kuaipai(a,left,right);
    }
    private static void kuaipai(int a[],int left,int right){//a[]代表无序数组，left代表左边界，right代表右边界
        int x=a[left],i=left,j=right;
        while (i>=j){
            return;
        }
        while (i<j){
            while (i<j&&a[j]>x) {//从右边界开始判断，如果大于x值，j往左移，如果遇见小于的话，跳出循环
                j--;
            }
            a[i]=a[j];//跳出循环后，将后面小于x的值，移动到前面去
            while (i<j&&a[i]<x){
                i++;
            }
            a[j]=a[i];
        }//当i=j时，将x的值赋值到a[i]上去，这时比x小的都在左边，比x大的都在右边
        a[i]=x;
        kuaipai(a,left,i-1); //从a[i]，分开，递归判断左边的数值和右边的数值
        kuaipai(a,i+1,right);
    }
//    链表快排
    public static void linkkuaipai(LINK_NODE head, LINK_NODE end){
        if (head==null||head==end){
            return;
        }
        int t;
        LINK_NODE p=head.getNext();  //用来遍历的元素
        LINK_NODE small=head;
        while (p!=end){
            if (p.getData()<small.getData()){  // 从头结点之后第一个开始
                small=small.getNext();    // 比头结点小的元素个数指向small
                t=small.getData();
                small.setData(p.getData());
                p.setData(t);
            }
            p=p.getNext();     //尾结点不与small元素比较
        }                     //从头结点之后开始的元素到small都是比头结点小的元素
        t=head.getData();
        head.setData(small.getData());
        small.setData(t);
        linkkuaipai(head,small);
        linkkuaipai(small.getNext(),end);
    }


//    向下调整堆
      private static void adjustdown(int a[],int i,int n){   //n为元素的个数
        int j=2*i+1;
        while (j<n){
            if (j+1<n&&a[j]>a[j+1]){
                j++;
            }
            if (a[i]<a[j]){
                break;
            }

            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

            i=j;
            j=2*i+1;
        }
    }

//    建堆
      private static void makeheap(int a[],int n){
       for (int i=n/2-1;i>=0;i--){         //((n-1)*2)+1 =n/2-1
           adjustdown(a,i,n);       //从下面结点开始调整
       }
    }
//    堆排序   大根堆   先建小堆
       public static void duipaixu(int a[]){
       int len=a.length,t;
       makeheap(a,len);
       for (int i=len-1;i>=0;i--){
            t=a[i];
            a[i]=a[0];
            a[0]=t;
            adjustdown(a,0,i);    //最底下的最大值与0号元素交换
       }
    }

    //归并合并
    static int b[] = new int[100];
    private static void hebing(int a[],int left,int mid,int right) {
       for (int i=left;i<=right;i++){
            b[i]=a[i];
       }
       int k=left,i=left,j=mid+1;
       for (;i<=mid&&j<=right;k++){
           if (b[i]<b[j]){
               a[k]=b[i++];
           }
           else a[k]=b[j++];
       }
       while (i<=mid){
           a[k++]=b[i++];
       }
       while (j<=right){
           a[k++]=b[j++];
       }
    }
     //二路归并算法
     private static void guibing(int a[],int left,int right){
         if(left<right){
             int mid=(left+right)/2;
             guibing(a,left,mid);
             guibing(a,mid+1,right);
             hebing(a,left,mid,right);
         }
    }
    public static void erluguibing(int a[]) {
        guibing(a,0,a.length-1);
    }
}
