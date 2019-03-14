package lyx.suanfa;

import java.util.*;

/**
 * @Title tree2     全排列   是否是子树  二叉树的镜像   和为输入整数的所有路径。平衡树
 * @Description     树的高度    树的宽度    //公共祖先
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 11:20
 */
public class tree2 {

    public static int total=0;
    public static void quanpailie(String a[]){       //全排列算法
        pailie(a,0,a.length-1);
        System.out.println("总数： "+total);
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
                String temp=a[left];   //交换第一个元素
                a[left]=a[i];
                a[i]=temp;
                pailie(a,left+1,right); //递归
                temp=a[left];     //换回来
                a[left]=a[i];
                a[i]=temp;
            }
        }
    }

//    题目描述
//
//    输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
//
//    解题思路
//
//    递归思想，如果根节点相同则递归调用IsSubtree()，如果根节点不相同，
//    则判断root1的左子树和roo2是否相同，再判断右子树和root2是否相同;
//    注意节点为空的条件，HasSubTree中，只要有树为空就返回false;
//    IsSubtree中，要先判断root2，如果root2为空，则说明第二棵树遍历完了，即匹配成功。
//    node2是否是node1的子树
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

//    二叉树的镜像
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

//    题目描述
//
//    输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
//    路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
//
//    解题思路
//
//    用前序遍历的方式访问到某一结点时，把该结点添加到路径上，并用目标值减去该节点的值。
//    如果该结点为叶结点并且目标值减去该节点的值刚好为0，则当前的路径符合要求，我们把加入res数组中。
//    如果当前结点不是叶结点，则继续访问它的子结点。当前结点访问结束后，递归函数将自动回到它的父结点。因此我们在函数退出之前要在路径上删除当前结点，以确保返回父结点时路径刚好是从根结点到父结点的路径。
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

//    树的深度
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

    //树的宽度
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
    //是否是平衡树
    public static boolean isbalance_avl(TREE_NODE node){
        if (node==null){
            return true;
        }
        if (Math.abs(treedeep1(node.getLeft())-treedeep1(node.getRight()))<=1){
            return isbalance_avl(node.getLeft())&&isbalance_avl(node.getRight());
        }
        else return false;
    }

    //公共祖先
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

//    是否是BST 二叉查找树    可以中序遍历保存值  若是BST 值是递增的
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
