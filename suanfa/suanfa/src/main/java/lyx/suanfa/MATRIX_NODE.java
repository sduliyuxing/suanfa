package lyx.suanfa;

/**
 * @Title MATRIX_NODE
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 16:36
 */
public class MATRIX_NODE {

    private int edges[][];
    private int e_num;  //�ߵ���Ŀ
    private int v_num;   //������Ŀ

    public int[][] getEdges() {
        return edges;
    }

    public void setEdges(int[][] edges) {
        this.edges = edges;
    }

    public int getE_num() {
        return e_num;
    }

    public void setE_num(int e_num) {
        this.e_num = e_num;
    }

    public int getV_num() {
        return v_num;
    }

    public void setV_num(int v_num) {
        this.v_num = v_num;
    }

    public MATRIX_NODE(int n) {
        v_num=n;
        edges=new int[n][n];
    }
    public MATRIX_NODE(int n,int edges[][]){
        v_num=n;
        e_num=0;
        this.edges=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                this.edges[i][j]=edges[i][j];
                if (edges[i][j]!=0||edges[i][j]!=-1){
                    e_num++;
                }
            }
        }
    }
}

