package lyx.suanfa.singleton;

/**
 * @Title singleton4
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:52
 */
public class singleton4 {

//    ˫����/˫��У������DCL���� double-checked locking��
//    JDK �汾��JDK1.5 ��
//    �Ƿ� Lazy ��ʼ������
//    �Ƿ���̰߳�ȫ����
//    ʵ���Ѷȣ��ϸ���
//    ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
//    getInstance() �����ܶ�Ӧ�ó���ܹؼ���

    private static singleton4 instance;
    private singleton4(){

    }
    public static singleton4 getinstance(){
        if (instance==null){
            synchronized (singleton4.class){
                if (instance==null){
                    instance=new singleton4();
                }
            }
        }
        return instance;
    }
}
