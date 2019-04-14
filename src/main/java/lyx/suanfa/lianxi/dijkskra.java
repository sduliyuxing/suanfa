package lyx.suanfa.lianxi;

/**
 * @Title dijkskra
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\18 0018 8:41
 */
public class dijkskra {

    private int dis[],vis[],w[][];

    public int dijkstra(int n){
        for (int i=1;i<=n;i++){   //��ʼ��v0��vi�ľ���
            dis[i]=w[0][i];
        }
        vis[0]=1;   //���v0
        for (int i=1;i<=n;i++){
            int min=0,k=0;
            for (int j=0;j<=n;j++){   //��������ĵ�
                if (vis[j]==0&&dis[j]<min){
                    min=dis[j];
                    k=j;
                }
            }
            vis[k]=1;
            for (int j=1;j<=n;j++){
                if (vis[j]==0&&min+w[k][j]<dis[j]){
                    dis[j]=min+w[k][j];
                }
            }
        }
        return dis[n];
    }
}
