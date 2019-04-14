package lyx.suanfa;

/**
 * @Title LINK_NODE
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\14 0014 16:26
 */
public class LINK_NODE {
    private int data;
    private LINK_NODE next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LINK_NODE getNext() {
        return next;
    }

    public void setNext(LINK_NODE next) {
        this.next = next;
    }

    public LINK_NODE() {
    }

    public LINK_NODE(int data, LINK_NODE next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "LINK_NODE{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
