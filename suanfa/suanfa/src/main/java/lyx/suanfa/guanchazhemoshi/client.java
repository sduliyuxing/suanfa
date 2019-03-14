package lyx.suanfa.guanchazhemoshi;

/**
 * @Title client
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
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
        System.out.println(name+"收到消息："+message);
    }
}
