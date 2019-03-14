package lyx.suanfa;

/**
 * @Title link1   ����ת   ������kֵ   �ϲ���������   ���������
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 17:38
 */
public class link1 {

    //����ת
    public static LINK_NODE fanzhuan(LINK_NODE node){
        if (node==null){
            return null;
        }
        LINK_NODE head=node;
        LINK_NODE temp=node.getNext();
        LINK_NODE r=temp.getNext();
        head.setNext(null);
        while (r!=null){
            temp.setNext(head);
            head=temp;
            temp=r;
            r=r.getNext();
        }
        temp.setNext(head);      //�������һ�����
        return temp;
    }


//    ��Ŀ����
//
//    ����һ����������������е�����k����㡣
//
//    ����˼·
//
//    �����˫ָ�뷨����������ָ�룬��һ��ָ��������ͷָ�뿪ʼ������ǰ��k-1����
//    �ڶ���ָ�뱣�ֲ������ӵ�k����ʼ���ڶ���ָ��Ҳ��ʼ�������ͷָ�뿪ʼ������
//    ��������ָ��ľ��뱣����k-1������һ��ָ�뵽�������β�ڵ�ʱ���ڶ���ָ��պ�ָ������k���ڵ㡣
//
//    ��עҪ��
//1. ����ͷָ���Ƿ�Ϊ�գ���Ϊ����ֱ�ӷ��ػ�null
//2. k�Ƿ�Ϊ0��kΪ0Ҳ����Ҫ���ҵ�����0���ڵ㣬���ڼ���һ���Ǵ�1��ʼ�ģ���������0û�����壬����null
//3. k�Ƿ񳬳�����ĳ��ȣ��������Ľڵ��������k������ָ����ƵĹ����л����nextָ���ָ��Ĵ���
//    ���Գ�����Ҫ��һ���ж�

    public static LINK_NODE getk(LINK_NODE node,int k){
        if (node==null||k<1){
            return null;
        }
        int i=0;
        LINK_NODE qian=node;
        LINK_NODE hou=node;
        for (;i<k;i++){
            if (qian==null){
                return null;
            }
            qian=qian.getNext();
        }
        while (qian!=null){
            qian=qian.getNext();
            hou=hou.getNext();
        }
        return hou;
    }

//    ��Ŀ����
//
//    ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
    public static LINK_NODE hebing1(LINK_NODE node1,LINK_NODE node2){
        if (node1==null){
            return node2;
        }
        if (node2==null){
            return node1;
        }
        LINK_NODE node=new LINK_NODE();
        if (node1.getData()<node2.getData()){
            node=node1;
            node.setNext(hebing1(node1.getNext(),node2));
        }
        else {
            node=node2;
            node.setNext(hebing1(node1,node2.getNext()));
        }
        return node;
    }
    public static LINK_NODE hebing2(LINK_NODE node1,LINK_NODE node2){
        if (node1==null){
            return node2;
        }
        if (node2==null){
            return node1;
        }
        LINK_NODE node=null,temp=null;
        if (node1.getData()<node2.getData()){
            node=node1;
            node1=node1.getNext();
        }
        else {
            node=node2;
            node2=node2.getNext();
        }
        temp=node;
       while (node1!=null&&node2!=null){
           if (node1.getData()<node2.getData()){
               temp.setNext(node1);
               temp=temp.getNext();
               node1=node1.getNext();
           }
           else {
               temp.setNext(node2);
               temp=temp.getNext();
               node2=node2.getNext();
           }
       }
       if (node1!=null){
           temp.setNext(node1);
       }
       else temp.setNext(node2);
        return node;
    }

//    ���������
    public static LINK_NODE gonggong(LINK_NODE node1,LINK_NODE node2){
        if (node1==null||node2==null){
            return null;
        }
        int count1=0,count2=0;
        while (node1!=null){
            count1++;
            node1=node1.getNext();
        }
        while (node2!=null){
            count2++;
            node2=node2.getNext();
        }
        if (count1>count2){
            int len=count1-count2;
            while (len>0){
                node1=node1.getNext();
                len--;
            }
        }
        else {
            int len=count2-count1;
            while (len>0){
                node2=node2.getNext();
                len--;
            }
        }
        while (node1!=null&&node2!=null){
            if (node1==node2){
                return node1;
            }
            node1=node1.getNext();
            node2=node2.getNext();
        }
        return null;
    }
}