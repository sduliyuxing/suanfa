package lyx.suanfa.lianxi;

/**
 * @Title zuichangzichuan
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\18 0018 10:08
 */
public class zuichangzichuan {
    private String s1;
    private String s2;

    private int dp[][],i,j,max=0;

    public zuichangzichuan(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int zichuan(){
        for (i=0;i<s1.length();i++){
            for (j=0;j<s2.length();j++){
                dp[i][j]=0;
            }
        }
        for (i=0;i<s1.length();i++){
            for (j=0;j<s2.length();j++){
                if (s1.charAt(i)==s2.charAt(j)){
                    if (i>0&&j>0){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else dp[i][j]=1;
                    if (max<dp[i][j]){
                        max=dp[i][j];
                    }
                }
            }
        }
        return max;
    }

}
