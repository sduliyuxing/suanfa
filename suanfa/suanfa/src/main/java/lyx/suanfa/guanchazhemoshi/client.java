package lyx.suanfa.guanchazhemoshi;

/**
 * @Title client
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\25 0025 10:05
 */
public class client implements guanchazhe {

    private String message;
    private String name;

    public client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        System.out.println(name+"�յ���Ϣ��"+message);
    }
}
