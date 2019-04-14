package lyx.suanfa;

/**
 * @Title link1   链表反转   倒数第k值   合并有序链表   链表公共结点
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 17:38
 */
public class link1 {

    //链表反转
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
        temp.setNext(head);      //设置最后一个结点
        return temp;
    }


//    题目描述
//
//    输入一个链表，输出该链表中倒数第k个结点。
//
//    解题思路
//
//    经典的双指针法。定义两个指针，第一个指针从链表的头指针开始遍历向前走k-1步，
//    第二个指针保持不动，从第k步开始，第二个指针也开始从链表的头指针开始遍历，
//    由于两个指针的距离保持在k-1，当第一个指针到达链表的尾节点时，第二个指针刚好指向倒数第k个节点。
//
//    关注要点
//1. 链表头指针是否为空，若为空则直接返回回null
//2. k是否为0，k为0也就是要查找倒数第0个节点，由于计数一般是从1开始的，所有输入0没有意义，返回null
//3. k是否超出链表的长度，如果链表的节点个数少于k，则在指针后移的过程中会出现next指向空指针的错误，
//    所以程序中要加一个判断

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

//    题目描述
//
//    输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
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

//    链表公共结点
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