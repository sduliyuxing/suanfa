package lyx.suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Title sort3      //��ӡͼ����        ������ȱ���
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 17:07
 */
public class sort3 {

    public static void print(MATRIX_NODE node){    //��ӡͼ����
        int n=node.getV_num();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(node.getEdges()[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void dfs(MATRIX_NODE node){  //������ȱ���
        int n=node.getV_num();
        int visit[]=new int[n];
        for (int i=0;i<n;i++){
            visit[i]=0;
        }
        dfsdfs(0, visit,node);
        System.out.println("����");
        int i=0;
        while (i<n){
            if (visit[i]==0){
                break;
            }
            i++;
        }
        if (i<n){
            System.out.println("���ܱ�������ͼ���");
        }else System.out.println("��������");
    }
    //n ���
    private static void dfsdfs(int n,int visit[],MATRIX_NODE node){
        visit[n]=1;
        System.out.print(n+"-->");
        for (int i=0;i<visit.length;i++){
            if (node.getEdges()[n][i]!=0&&node.getEdges()[n][i]!=-1&&visit[i]==0){
                dfsdfs(i,visit,node);
            }
        }
    }

    public static void bfs(MATRIX_NODE node){  //������ȱ���
        int n=node.getV_num();
        int visit[]=new int[n];
        for (int i=0;i<n;i++){
            visit[i]=0;
        }
        bfsbfs(0,visit,node);
        System.out.println("����");
        int i=0;
        while (i<n){
            if (visit[i]==0){
                break;
            }
            i++;
        }
        if (i<n){
            System.out.println("���ܱ�������ͼ���");
        }else System.out.println("��������");
    }

    public static void bfsbfs(int n,int visit[],MATRIX_NODE node){
        visit[n]=1;
        System.out.print(n+"-->");
        Queue<Integer> queue=new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()){
            n=queue.remove();
            for (int i=0;i<visit.length;i++){
                if (node.getEdges()[n][i]!=0&&node.getEdges()[n][i]!=-1&&visit[i]==0) {
                    queue.add(i);
                    System.out.print(i+"-->");
                    visit[i]=1;
                }
            }
        }
    }
}