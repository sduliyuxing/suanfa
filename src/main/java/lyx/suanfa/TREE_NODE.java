package lyx.suanfa;

/**
 * @Title TREE_NODE
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\15 0015 11:26
 */
public class TREE_NODE {
    private int data;
    private TREE_NODE left;
    private TREE_NODE right;

    public TREE_NODE() {
    }

    public TREE_NODE(int data) {
        this.data = data;
    }

    public TREE_NODE(int data, TREE_NODE left, TREE_NODE right) {

        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TREE_NODE{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TREE_NODE getLeft() {
        return left;
    }

    public void setLeft(TREE_NODE left) {
        this.left = left;
    }

    public TREE_NODE getRight() {
        return right;
    }

    public void setRight(TREE_NODE right) {
        this.right = right;
    }
}
