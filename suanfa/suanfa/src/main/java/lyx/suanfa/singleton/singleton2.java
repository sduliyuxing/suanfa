package lyx.suanfa.singleton;

/**
 * @Title singleton2
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\17 0017 16:47
 */
public class singleton2 {

//    ����ʽ���̰߳�ȫ
//    �Ƿ� Lazy ��ʼ������
//    �Ƿ���̰߳�ȫ����
//    ʵ���Ѷȣ���
//    ���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
//    �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
//    ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�

    private static singleton2 instance;

    private singleton2(){

    }

    public static synchronized singleton2 getinstance(){
      if (instance==null){
          instance=new singleton2();
      }
      return instance;
    }
}
