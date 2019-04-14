package lyx.suanfa.lianxi;

/**
 * @Title kmp
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\18 0018 11:22
 */
public class kmp {

    private int next[];

    public void getnext(String p,int next[]){
        int i=0; //p的下标
        int j=-1;
        next[0]=-1;
        while (i<next.length){
            if (j==-1||p.charAt(i)==p.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }
            else j=next[j];
        }
    }

    public int kmpsuanfa(String s,String p,int next[]){
        int i=0;  //s下标
        int j=0;  //j下标
        while (i<s.length()&&j<p.length()){
            if (j==-1||s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            else j=next[j];
        }
        if (j==p.length()){
            return i-j;
        }
        return -1;
    }
}
