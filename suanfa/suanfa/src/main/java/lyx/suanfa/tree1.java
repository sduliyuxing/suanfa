package lyx.suanfa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Title tree1  ��   ǰ�� ���� ���� ���
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\15 0015 11:26
 */
public class tree1 {

    //    �������
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

    //    ����ǵݹ�
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

    //    �������
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

    //    ����ǵݹ�
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

    //    �������
    public static void houxu(TREE_NODE node) {
       if (node!=null){
           zhongxu(node.getLeft());
           zhongxu(node.getRight());
           System.out.print(node.getData() + "\t");
       }
    }

    //    ����ǵݹ�
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
                p = p.getLeft();   //����
            } else {
                p = stack.pop();
                System.out.print(p.getData() + "\t");
                r = p;
                p = null;
            }
        }
    }

//    ��α���
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

