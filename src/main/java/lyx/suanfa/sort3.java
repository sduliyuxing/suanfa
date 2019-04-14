package lyx.suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Title sort3      //打印图矩阵        深度优先遍历
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 17:07
 */
public class sort3 {

    public static void print(MATRIX_NODE node){    //打印图矩阵
        int n=node.getV_num();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(node.getEdges()[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void dfs(MATRIX_NODE node){  //深度优先遍历
        int n=node.getV_num();
        int visit[]=new int[n];
        for (int i=0;i<n;i++){
            visit[i]=0;
        }
        dfsdfs(0, visit,node);
        System.out.println("结束");
        int i=0;
        while (i<n){
            if (visit[i]==0){
                break;
            }
            i++;
        }
        if (i<n){
            System.out.println("不能遍历所有图结点");
        }else System.out.println("遍历结束");
    }
    //n 结点
    private static void dfsdfs(int n,int visit[],MATRIX_NODE node){
        visit[n]=1;
        System.out.print(n+"-->");
        for (int i=0;i<visit.length;i++){
            if (node.getEdges()[n][i]!=0&&node.getEdges()[n][i]!=-1&&visit[i]==0){
                dfsdfs(i,visit,node);
            }
        }
    }

    public static void bfs(MATRIX_NODE node){  //广度优先遍历
        int n=node.getV_num();
        int visit[]=new int[n];
        for (int i=0;i<n;i++){
            visit[i]=0;
        }
        bfsbfs(0,visit,node);
        System.out.println("结束");
        int i=0;
        while (i<n){
            if (visit[i]==0){
                break;
            }
            i++;
        }
        if (i<n){
            System.out.println("不能遍历所有图结点");
        }else System.out.println("遍历结束");
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