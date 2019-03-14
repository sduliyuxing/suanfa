package lyx.suanfa.lianxi;

/**
 * @Title dijkskra
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\18 0018 8:41
 */
public class dijkskra {

    private int dis[],vis[],w[][];

    public int dijkstra(int n){
        for (int i=1;i<=n;i++){   //初始化v0到vi的距离
            dis[i]=w[0][i];
        }
        vis[0]=1;   //标记v0
        for (int i=1;i<=n;i++){
            int min=0,k=0;
            for (int j=0;j<=n;j++){   //查找最近的点
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
