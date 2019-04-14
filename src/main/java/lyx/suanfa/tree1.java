package lyx.suanfa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Title tree1  树   前序 中序 后序 层次
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\15 0015 11:26
 */
public class tree1 {

    //    先序遍历
    public static void xianxu(TREE_NODE node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + "\t");
        if (node.getLeft() != null) {
            xianxu(node.getLeft());
        }
        if (node.getRight() != null) {
            xianxu(node.getRight());
        }
    }

    //    先序非递归
    public static void xianxu1(TREE_NODE node) {
        Stack<TREE_NODE> stack = new Stack<>();
        TREE_NODE p = node;
        while (p != null || !stack.empty()) {
            while (p != null) {
                System.out.print(p.getData() + "\t");
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.empty()) {
                p = stack.pop();
                p = p.getRight();
            }
        }
    }

    //    中序遍历
    public static void zhongxu(TREE_NODE node) {
        if (node == null) {
            return;
        }
        if (node.getLeft() != null) {
            zhongxu(node.getLeft());
        }
        System.out.print(node.getData() + "\t");
        if (node.getRight() != null) {
            zhongxu(node.getRight());
        }
    }

    //    中序非递归
    public static void zhongxu1(TREE_NODE node) {
        Stack<TREE_NODE> stack = new Stack<>();
        TREE_NODE p = node;
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.empty()) {
                p = stack.pop();
                System.out.print(p.getData() + "\t");
                p = p.getRight();
            }
        }
    }

    //    后序遍历
    public static void houxu(TREE_NODE node) {
       if (node!=null){
           zhongxu(node.getLeft());
           zhongxu(node.getRight());
           System.out.print(node.getData() + "\t");
       }
    }

    //    后序非递归
    public static void houxu1(TREE_NODE node) {
        Stack<TREE_NODE> stack = new Stack<>();
        TREE_NODE p = node, r = null;
        while (p != null || !stack.empty()) {
            while (p != null) {
                stack.push(p);
                p = p.getLeft();
            }
            p = stack.peek();
            if (p.getRight() != null && p.getRight() != r) {
                p = p.getRight();
                stack.push(p);
                p = p.getLeft();   //左走
            } else {
                p = stack.pop();
                System.out.print(p.getData() + "\t");
                r = p;
                p = null;
            }
        }
    }

//    层次遍历
    public static void cenci(TREE_NODE node){
        Queue<TREE_NODE> queue=new LinkedList<>();
        TREE_NODE p=node;
        queue.add(p);
        while (!queue.isEmpty()){
            p = queue.remove();
            System.out.print(p.getData()+"\t");
            if (p.getLeft()!=null){
                queue.add(p.getLeft());
            }
            if (p.getRight()!=null){
                queue.add(p.getRight());
            }
        }

    }
}

