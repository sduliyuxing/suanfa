package lyx.suanfa.lianxi;

/**
 * @Title feibonaqi   斐波那契数列   1 2 3 5  返回第n个值
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0个
 * @Create 2019\1\18 0018 8:55
 */
public class feibonaqi {

    public static Integer shulie1(int n){
        if (n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return shulie1(n-1)+shulie1(n-2);
    }

    public static Integer shulie2(int n){
        if (n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int a=1,b=2;     //a为前一项 b为后一项
        for (int i=3;i<=n;i++){
            b=a+b;
            a=b-a;
        }
        return b;
    }
}
