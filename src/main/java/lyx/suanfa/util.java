package lyx.suanfa;

/**
 * @Title    链表构建 ，打印，获取尾结点，  先序中序构建二叉树    构建二叉排序树
  * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\15 0015 11:29
 */
public class util {

    //        链表初始化构造
    public static LINK_NODE initlink(int a[]){
        LINK_NODE x=new LINK_NODE(a[a.length-1],null);
        for (int i=a.length-2;i>=0;i--){
            LINK_NODE y=new LINK_NODE(a[i],x);
            x=y;
        }
        return x;
    }

    //        链表打印
    public static void printlink(LINK_NODE x){
        while (x!=null){
            System.out.print(x.getData()+"\t");
            x=x.getNext();
        }
        System.out.println();
    }

    //        获取链表尾结点
    public static LINK_NODE getend(LINK_NODE x){
        while (x.getNext()!=null){
            x=x.getNext();
        }
        return x;
    }


//    先序中序构建二叉树
        private static TREE_NODE inittree(int a[],int b[],int aleft,int aright,int bleft,int bright){
        if (aleft>aright||bleft>bright){
            return null;
        }
        TREE_NODE node=new TREE_NODE(a[aleft]);
        int i=bleft,len,ren;
        while (b[i]!=a[aleft]){
            i++;
        }
        len=i-bleft;
        ren=bright-i;
        if (len>0){
           node.setLeft(inittree(a,b,aleft+1,aleft+len,bleft,bleft+len-1));
        }
        else node.setLeft(null);
        if (ren>0){
            node.setRight(inittree(a,b,aright-ren+1,aright,bright-ren+1,bright));
        }
        else node.setRight(null);
        return node;
    }

    public static TREE_NODE erchashu(int a[],int b[]){
        if(a.length==0||b.length==0){
            return null;
        }
        TREE_NODE node = inittree(a, b, 0, a.length - 1, 0, b.length - 1);
        return node;
    }


    //二叉排序树构造
    public static TREE_NODE paixushu(int a[]){

        TREE_NODE node = new TREE_NODE(a[0],null,null);
        if (a.length>1) {
            for (int i=1;i<a.length;i++){
                charu(node,a[i]);
            }
        }
        return node;
    }
    private static TREE_NODE charu(TREE_NODE node,int k){
        if (node==null){
            node=new TREE_NODE(k);
            node.setLeft(null);
            node.setRight(null);
        }
        if (node.getData()>k){
            node.setLeft(charu(node.getLeft(),k));
        }else if(node.getData()<k){
            node.setRight(charu(node.getRight(),k));
        }
        return node;
    }
}
