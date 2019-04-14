package lyx.suanfa;

import lyx.suanfa.lianxi.*;
import org.junit.Test;

import java.util.*;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\14 0014 14:58
 */
public class test{

        @Test
        public void jvmtest(){
            String s="abc in k";
            String t=" i";
            System.out.println(s.contains(t));
//            System.out.println(s);
//            s=s.replace(" ","*");
//            System.out.println(s);
//            StringBuffer buffer=new StringBuffer();
//            System.out.println(s);

        }

        int a[]= {2,5,9,6,1,0,8,4};

        @Test
        public void test1() {
//        sort1.maopao(a);
//        sort1.maopao2(a);

//        sort1.xuanze(a);

//        sort1.charu(a);

//        sort2.kuaipaisuanfa(a);

//          sort2.duipaixu(a);

            sort2.erluguibing(a);

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + "\t");
            }
        }

        @Test
        public void test2(){ //链表快排
            LINK_NODE x=util.initlink(a);
            util.printlink(x);
            LINK_NODE end=util.getend(x);
            sort2.linkkuaipai(x,null);//尾结点第一个为null
            util.printlink(x);
        }

    @Test
    public void test3(){//先序中序构建二叉树   遍历
        int a[]={1,2,3,4,5,6,7};
        int b[]={3,2,4,1,6,5,7};
        TREE_NODE node = util.erchashu(a, b);
        System.out.print("先序递归： ");
        tree1.xianxu(node);
        System.out.print("      先序非递归： ");
        tree1.xianxu1(node);
        System.out.println();
        System.out.print("中序递归： ");
        tree1.zhongxu(node);
        System.out.print("      中序非递归： ");
        tree1.zhongxu1(node);
        System.out.println();
        System.out.print("后序递归： ");
        tree1.houxu(node);
        System.out.print("      后序非递归： ");
        tree1.houxu1(node);
        System.out.println();
        System.out.print("层次遍历：");
        tree1.cenci(node);
    }

    @Test
    public void test4(){//全排列算法
        String a[]={"1","2","3","4","5"};
         tree2.quanpailie(a);
    }

    @Test
    public void test5(){   //链表反转
        LINK_NODE node = util.initlink(a);
        util.printlink(node);
        node=link1.fanzhuan(node);
        util.printlink(node);
    }

    @Test
    public void test6(){
        System.out.println(feibonaqi.shulie1(4)); //返回斐波那契第n项值
        System.out.println(feibonaqi.shulie2(4));
    }

    @Test
    public void test7(){
        System.out.println(yidegeshu.shuliang(3)); //二进制中1的个数
    }
    @Test
    public void test8(){
        int a[]={1,2,3,4,5,6};          //链表倒数第k个值    合并有序链表
        int b[]={1,3,5,7,9};
        int c[]={2,4,6,8};
        LINK_NODE node = util.initlink(a);
        LINK_NODE node1 = util.initlink(b);
        LINK_NODE node2 = util.initlink(c);
        LINK_NODE nodek = link1.getk(node, 1);
        System.out.println(nodek.getData());
        LINK_NODE node3 = link1.hebing1(node1, node2);
        util.printlink(node3);
        node1 = util.initlink(b);
        node2 = util.initlink(c);
        util.printlink(node1);
        util.printlink(node2);
        LINK_NODE node4=link1.hebing2(node1,node2);
        util.printlink(node4);
    }
    @Test
    public void test9(){            //       1
        int a[]={1,2,3,4,5,6,7};   //     2    5
        int b[]={3,2,4,1,6,5,7};   //  3   4  6   7
        TREE_NODE node = util.erchashu(a, b);
        ArrayList<ArrayList<Integer>> lists = tree2.findpath(13, node);
        for(ArrayList<Integer>list:lists){
            for (Integer n:list){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
        System.out.println(tree2.treedeep1(node));//树的深度
        System.out.println(tree2.treedeep2(node));
    }

    @Test
    public void test10(){      //数组元素超过一半    最小k个数
       int a[]={3,2,3,4,3,2,4,3,3};
       int b[]={6,5,7,8,3,4,1};
        System.out.println(chaoguoyiban.dayu1(a));
        System.out.println(chaoguoyiban.dayu2(a));
        System.out.println(chaoguoyiban.dayu3(a));
        System.out.println(zuixiaodekgeshu.getmink(b, 4));
    }
    @Test
    public void test11(){      //子数组和
        int a[]={1,-1,2,-1,2};
        HashMap<Integer, ArrayList> map = lianxuzishuzuzuidahe.findhe(a);
        for (HashMap.Entry entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    @Test
    public void test12(){      //数组组合最大
        String a[]={"1","3","32"};
        String s = zuhezuida.zuida(a);
        System.out.println(s);
    }
    @Test
    public void test13(){
        String s="123456";               //字符串左移k位
        System.out.println(zuoyisuzhu.zuoyi1(s, 3));
        System.out.println(zuoyisuzhu.zuoyi2(s, 3));
        long t=zifuchuanzhuanhuan.zhuanhuan("135246");       //字符串转数字
        System.out.println(t);
    }
    @Test
    public void test14(){
         int a[]={1,2,3,4,5,6};        //   循环链表入口
         LINK_NODE node=util.initlink(a);
         LINK_NODE node1=null,root=node;
        while (root.getNext()!=null){
            if (root.getData()==4){
                node1=root;
             }
            root=root.getNext();
         }
        root.setNext(node1);     //构造循环链表
         LINK_NODE rukou=huanderukou.getrukou(node);
        System.out.println(rukou.getData());
    }

    @Test
    public void test15(){
         int a[]={3,1,2,4,5};
        TREE_NODE node=util.paixushu(a);    //构造二叉排序树
        tree1.cenci(node);
    }


    @Test
    public void test16(){
            int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(sort1.erfenchazhao1(a, 3));
        System.out.println(sort1.erfenchazhao2(a, 3, 0, a.length - 1));
    }
    @Test
    public void test17(){
       int a[][]={{0,1,1,0,1},{1,0,0,1,0},{1,0,0,0,0},{0,1,0,0,0},{1,0,0,0,0}};
       MATRIX_NODE node=new MATRIX_NODE(5,a);
       sort3.print(node);          //  4- 0--------1               // 0 1 1 0 1
       sort3.dfs(node);              //   |        |               // 1 0 0 1 0
       sort3.bfs(node);              //   2        3               // 1 0 0 0 0
    }                                 //                           // 0 1 0 0 0
                                      //                           // 1 0 0 0 0
    @Test
    public void test18(){           //树的宽度         //         1
        int a[]={1,2,3,4,5,6,7,8};                     //     2    6
        int b[]={4,3,2,5,1,7,6,8};                    //    3   5  7   8
        TREE_NODE node = util.erchashu(a, b);       //    4
        tree1.cenci(node);
        System.out.println();
        System.out.println(tree2.treekuandu(node));
    }
}
