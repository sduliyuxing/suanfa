package lyx.suanfa.guanchazhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title service
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:00
 */
public class service implements beiguanchazhe {

    private String message;
    //ע�⵽���List���ϵķ��Ͳ���ΪObserver�ӿڣ����ԭ������ӿڱ�̶���������ʵ�ֱ��
    private List<guanchazhe> list=new ArrayList<>();

    @Override
    public void add(guanchazhe obj) {
         list.add(obj);
    }

    @Override
    public void remove(guanchazhe obj) {
       list.remove(obj);
    }

    @Override
    public void send(String message) {
        this.message=message;
        System.out.println("������Ϣ��"+message);
        for (int i=0;i<list.size();i++){
            guanchazhe client=list.get(i);
            client.update(message);
        }
    }
}
