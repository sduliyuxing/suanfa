package lyx.suanfa;

/**
 * @Title tree3
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\18 0018 9:41
 */
public class tree3 {
    //����������Զ�������ڵ�ľ���
    //ÿ���ڵ������򱣴��������������߶�
    private tree3 node;
    private tree3 left;
    private tree3 right;
    private Integer leftlength;
    private Integer rightlength;

    private static int max=0;
    public static int maxdist(tree3 node){  //�������������߶�
       if (node==null){
           return 0;
       }
       if (node.left!=null){
           node.leftlength=maxdist(node.left)+1;
       }
       if (node.right!=null){
           node.rightlength=maxdist(node.right)+1;
       }
       int sum=node.leftlength+node.rightlength;
       if (sum>max){
           max=sum;
       }
       return node.leftlength>node.rightlength?node.leftlength:node.rightlength;

    }
    public static int zuiyuanjili(TREE_NODE node){
        return max;
    }




    public tree3 getNode() {
        return node;
    }

    public void setNode(tree3 node) {
        this.node = node;
    }

    public tree3 getLeft() {
        return left;
    }

    public void setLeft(tree3 left) {
        this.left = left;
    }

    public tree3 getRight() {
        return right;
    }

    public void setRight(tree3 right) {
        this.right = right;
    }

    public Integer getLeftlength() {
        return leftlength;
    }

    public void setLeftlength(Integer leftlength) {
        this.leftlength = leftlength;
    }

    public Integer getRightlength() {
        return rightlength;
    }

    public void setRightlength(Integer rightlength) {
        this.rightlength = rightlength;
    }

}
