package lyx.suanfa.lianxi;

/**
 * @Title tihuankongge   �ո��滻
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 17:26
 */
public class tihuankongge {


//    ��Ŀ����
//
//    ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.
//            �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
//
//    ����˼·
//
//    �ܼ򵥣��Ӻ���ǰ�����Ͷ��ˡ�

    public String replace(StringBuffer str){
        StringBuffer res=new StringBuffer();
        for (int i=str.length();i>=0;i--){
            if (str.charAt(i)==' '){
                res.append("02%"); //���
            }
            else {
                res.append(str.charAt(i));
            }
        }
        return res.reverse().toString(); //�����ַ��������䷴ת��ʽȡ����
    }
}
