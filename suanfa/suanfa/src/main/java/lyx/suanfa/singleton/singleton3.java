package lyx.suanfa.singleton;

/**
 * @Title singleton3
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:50
 */
public class singleton3 {

//    ����ʽ
//    �Ƿ� Lazy ��ʼ������
//    �Ƿ���̰߳�ȫ����
//    ʵ���Ѷȣ���
//    ���������ַ�ʽ�Ƚϳ��ã������ײ�����������
//    �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
//    ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
//    ������ classloader ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ������
//    ��Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance ������
//    ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
//    ��ʱ���ʼ�� instance ��Ȼû�дﵽ lazy loading ��Ч����

    private static singleton3 instance=new singleton3();

    private singleton3(){

    }

    public static singleton3 getinstance(){
        return instance;
    }
}
