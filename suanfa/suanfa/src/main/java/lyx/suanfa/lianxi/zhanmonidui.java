package lyx.suanfa.lianxi;

import java.util.Stack;

/**
 * @Title zhanmonidui   ����ջģ�����
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 8:40
 */
public class zhanmonidui {

//    ��Ŀ����
//
//    ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
//
//    ����˼·
//
//    ����ջ stack1 �� stack2:
//
//    push �������� stack1 �н��У�
//    pop ������ stack2 �н��С��� stack2 ��Ϊ��ʱ��ֱ�� pop���� stack2 Ϊ��ʱ��
//    �Ȱ� stack1 �е�Ԫ�� pop ������push �� stack2 �У��ٴ� stack2 �� pop Ԫ�ء�

    private static Stack<Integer> stack1=new Stack<>();
    private static Stack<Integer> stack2=new Stack<>();

    public static void push(Integer node){
       stack1.push(node);
    }
    public static Integer pop(){
        if (stack1.empty()&&stack2.empty()){
            return null;
        }
        if (stack2.empty()){
            while (!stack1.empty()){
                Integer temp=stack1.pop();
                stack2.push(temp);
            }
        }
        return stack2.pop();
    }
}
