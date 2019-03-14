package lyx.suanfa.lianxi;

/**
 * @Title zuichangzixulie
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\18 0018 10:29
 */
public class zuichangzixulie {
    private String s1;
    private String s2;
    private int i,j;
    private int dp[][];
    private int print[][];

    public zuichangzixulie(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int zuidazixulie(){
        for (i=0;i<s1.length()+1;i++){     //创建0到i+1数组
            for (j=0;j<s2.length()+1;j++){
                dp[i][j]=0;
            }
        }
        for (i=1;i<s1.length()+1;i++){
            for (j=1;j<s2.length()+1;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    print[i][j]=0;
                }
                else if (dp[i-1][j]<dp[i][j-1]){
                    dp[i][j]=dp[i][j-1];
                    print[i][j]=1;
                }
                else {
                    dp[i][j]=dp[i-1][j];
                    print[i][j]=2;
                }
            }
        }
        return dp[i][j];
    }

    public void dayin(int print[][],String s,int i,int j){
        if (i==0||j==0){
            return;
        }
        if (print[i][j]==0){
            dayin(print,s,i-1,j-1);
            System.out.println(s.charAt(i-1));
        }
        else if (print[i][j]==1){
           dayin(print,s,i,j-1);
        }
        else if (print[i][j]==2){
            dayin(print,s,i-1,j);
        }
    }
}
