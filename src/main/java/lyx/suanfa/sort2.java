package lyx.suanfa;

/**
 * @Title sort2    ���� ���� �鲢
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\14 0014 15:59
 */
public class sort2 {
                                                    //����
    public static void kuaipaisuanfa(int a[]){

        int left=0,right=a.length-1;
        kuaipai(a,left,right);
    }
    private static void kuaipai(int a[],int left,int right){//a[]�����������飬left������߽磬right�����ұ߽�
        int x=a[left],i=left,j=right;
        while (i>=j){
            return;
        }
        while (i<j){
            while (i<j&&a[j]>x) {//���ұ߽翪ʼ�жϣ��������xֵ��j�����ƣ��������С�ڵĻ�������ѭ��
                j--;
            }
            a[i]=a[j];//����ѭ���󣬽�����С��x��ֵ���ƶ���ǰ��ȥ
            while (i<j&&a[i]<x){
                i++;
            }
            a[j]=a[i];
        }//��i=jʱ����x��ֵ��ֵ��a[i]��ȥ����ʱ��xС�Ķ�����ߣ���x��Ķ����ұ�
        a[i]=x;
        kuaipai(a,left,i-1); //��a[i]���ֿ����ݹ��ж���ߵ���ֵ���ұߵ���ֵ
        kuaipai(a,i+1,right);
    }
//    �������
    public static void linkkuaipai(LINK_NODE head, LINK_NODE end){
        if (head==null||head==end){
            return;
        }
        int t;
        LINK_NODE p=head.getNext();  //����������Ԫ��
        LINK_NODE small=head;
        while (p!=end){
            if (p.getData()<small.getData()){  // ��ͷ���֮���һ����ʼ
                small=small.getNext();    // ��ͷ���С��Ԫ�ظ���ָ��small
                t=small.getData();
                small.setData(p.getData());
                p.setData(t);
            }
            p=p.getNext();     //β��㲻��smallԪ�رȽ�
        }                     //��ͷ���֮��ʼ��Ԫ�ص�small���Ǳ�ͷ���С��Ԫ��
        t=head.getData();
        head.setData(small.getData());
        small.setData(t);
        linkkuaipai(head,small);
        linkkuaipai(small.getNext(),end);
    }


//    ���µ�����
      private static void adjustdown(int a[],int i,int n){   //nΪԪ�صĸ���
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

//    ����
      private static void makeheap(int a[],int n){
       for (int i=n/2-1;i>=0;i--){         //((n-1)*2)+1 =n/2-1
           adjustdown(a,i,n);       //�������㿪ʼ����
       }
    }
//    ������   �����   �Ƚ�С��
       public static void duipaixu(int a[]){
       int len=a.length,t;
       makeheap(a,len);
       for (int i=len-1;i>=0;i--){
            t=a[i];
            a[i]=a[0];
            a[0]=t;
            adjustdown(a,0,i);    //����µ����ֵ��0��Ԫ�ؽ���
       }
    }

    //�鲢�ϲ�
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
     //��·�鲢�㷨
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
