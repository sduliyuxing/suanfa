package lyx.suanfa.singleton;

/**
 * @Title singleton1
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:39
 */
public class singleton1 {

//    ����ʽ���̲߳���ȫ
//    �Ƿ� Lazy ��ʼ������
//    �Ƿ���̰߳�ȫ����
//    ʵ���Ѷȣ���
//    ���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
//    ���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������

    private static singleton1 instance;
    private singleton1(){

    }
    public static singleton1 getInstance(){
        if (instance==null){
            instance=new singleton1();
        }
        return instance;
    }
}
