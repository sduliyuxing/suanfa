package lyx.suanfa;

import java.util.*;

/**
 * @Title tree2     ȫ����   �Ƿ�������  �������ľ���   ��Ϊ��������������·����ƽ����
 * @Description     ���ĸ߶�    ���Ŀ��    //��������
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 11:20
 */
public class tree2 {

    public static int total=0;
    public static void quanpailie(String a[]){       //ȫ�����㷨
        pailie(a,0,a.length-1);
        System.out.println("������ "+total);
    }

    private static void pailie(String a[],int left,int right){
        if (left>right){
            for (int i=0;i<=right;i++){
                System.out.print(a[i]+"\t");
            }
            total++;
            System.out.println();
        }
        else {
            for (int i=left;i<=right;i++){
                String temp=a[left];   //������һ��Ԫ��
                a[left]=a[i];
                a[i]=temp;
                pailie(a,left+1,right); //�ݹ�
                temp=a[left];     //������
                a[left]=a[i];
                a[i]=temp;
            }
        }
    }

//    ��Ŀ����
//
//    �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
//
//    ����˼·
//
//    �ݹ�˼�룬������ڵ���ͬ��ݹ����IsSubtree()��������ڵ㲻��ͬ��
//    ���ж�root1����������roo2�Ƿ���ͬ�����ж���������root2�Ƿ���ͬ;
//    ע��ڵ�Ϊ�յ�������HasSubTree�У�ֻҪ����Ϊ�վͷ���false;
//    IsSubtree�У�Ҫ���ж�root2�����root2Ϊ�գ���˵���ڶ������������ˣ���ƥ��ɹ���
//    node2�Ƿ���node1������
    public static boolean hassubtree(TREE_NODE node1,TREE_NODE node2){
       if (node1==null||node2==null){
           return false;
       }
        return issubtree(node1,node2)||hassubtree(node1.getLeft(),node2)||hassubtree(node1.getRight(),node2);
    }

    private static boolean issubtree(TREE_NODE node1, TREE_NODE node2) {
        if (node2==null){
            return true;
        }
        if (node1==null){
            return false;
        }
        if (node1.getData()==node2.getData()){
            return issubtree(node1.getLeft(),node2.getLeft())&&issubtree(node1.getRight(),node2.getRight());
        }
        else return false;
    }

//    �������ľ���
public static void jingxiang(TREE_NODE node){
        if (node==null){
            return ;
        }
        TREE_NODE temp=node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);
        if (node.getLeft()!=null){
            jingxiang(node.getLeft());
        }
        if(node.getRight()!=null){
            jingxiang(node.getRight());
        }
    }

//    ��Ŀ����
//
//    ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
//    ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
//
//    ����˼·
//
//    ��ǰ������ķ�ʽ���ʵ�ĳһ���ʱ���Ѹý����ӵ�·���ϣ�����Ŀ��ֵ��ȥ�ýڵ��ֵ��
//    ����ý��ΪҶ��㲢��Ŀ��ֵ��ȥ�ýڵ��ֵ�պ�Ϊ0����ǰ��·������Ҫ�����ǰѼ���res�����С�
//    �����ǰ��㲻��Ҷ��㣬��������������ӽ�㡣��ǰ�����ʽ����󣬵ݹ麯�����Զ��ص����ĸ���㡣��������ں����˳�֮ǰҪ��·����ɾ����ǰ��㣬��ȷ�����ظ����ʱ·���պ��ǴӸ���㵽������·����
    static ArrayList<Integer> temp=new ArrayList<>();
    static ArrayList<ArrayList<Integer>> res=new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> findpath(int n,TREE_NODE node){
        if (node==null){
            return res;
        }
        n=n-node.getData();
        temp.add(node.getData());
        if (n==0&&node.getLeft()==null&&node.getRight()==null){
            ArrayList<Integer> arrayList=new ArrayList<>(temp);
            res.add(arrayList);
        }
        else {
            findpath(n,node.getLeft());
            findpath(n,node.getRight());
        }
        temp.remove(temp.size()-1);
        return res;
    }

//    �������
    public static int treedeep1(TREE_NODE node){
        if (node==null){
            return 0;
        }
        int left=treedeep1(node.getLeft());
        int right=treedeep1(node.getRight());
        return left>right?left+1:right+1;
    }
    public static int treedeep2(TREE_NODE node){
        if (node==null){
            return 0;
        }
        Queue<TREE_NODE> queue=new LinkedList<>();
        int deep=0;
        queue.add(node);
        while (!queue.isEmpty()) {
            int lenth=queue.size();
            deep++;
            while (lenth>0){
                TREE_NODE teep=queue.remove();
                if (teep.getLeft()!=null){
                    queue.add(teep.getLeft());
                }
                if (teep.getRight()!=null){
                    queue.add(teep.getRight());
                }
                lenth--;
            }
        }
        return deep;
    }

    //���Ŀ��
    public static int treekuandu(TREE_NODE node){
        int max=0;
        Queue<TREE_NODE> queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            int lenth=queue.size();
            while (lenth>0){
                TREE_NODE teep=queue.remove();
                if (teep.getLeft()!=null){
                    queue.add(teep.getLeft());
                }
                if (teep.getRight()!=null){
                    queue.add(teep.getRight());
                }
                lenth--;
            }
            lenth=queue.size();
            if (max<lenth){
                max=lenth;
            }
        }
        return max;
    }
    //�Ƿ���ƽ����
    public static boolean isbalance_avl(TREE_NODE node){
        if (node==null){
            return true;
        }
        if (Math.abs(treedeep1(node.getLeft())-treedeep1(node.getRight()))<=1){
            return isbalance_avl(node.getLeft())&&isbalance_avl(node.getRight());
        }
        else return false;
    }

    //��������
    public static TREE_NODE gonggongzuxian(TREE_NODE node,TREE_NODE node1,TREE_NODE node2){
        if (node==null||node1==null||node2==null){
            return null;
        }
        if (node==node1||node==node2){
            return node;
        }
        TREE_NODE left=gonggongzuxian(node.getLeft(),node1,node2);
        TREE_NODE right=gonggongzuxian(node.getRight(),node1,node2);
        if (left==null&&right==null){
            return node;
        }
        if (left==null){
            return right;
        }
        else return left;
    }

//    �Ƿ���BST ���������    ���������������ֵ  ����BST ֵ�ǵ�����
      static TREE_NODE root=null;
    public boolean isbst(TREE_NODE node){

        if (node!=null){
            if (!isbst(node.getLeft())){
                return false;
            }
            if (root!=null&&root.getData()>node.getData()){
                return false;
            }
            root=node;
            return isbst(node.getRight());
        }
        return true;
    }
}
