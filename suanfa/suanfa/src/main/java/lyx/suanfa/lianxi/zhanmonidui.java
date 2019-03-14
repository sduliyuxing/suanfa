package lyx.suanfa.lianxi;

import java.util.Stack;

/**
 * @Title zhanmonidui   两个栈模拟队列
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\18 0018 8:40
 */
public class zhanmonidui {

//    题目描述
//
//    用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
//
//    解题思路
//
//    两个栈 stack1 和 stack2:
//
//    push 动作都在 stack1 中进行，
//    pop 动作在 stack2 中进行。当 stack2 不为空时，直接 pop，当 stack2 为空时，
//    先把 stack1 中的元素 pop 出来，push 到 stack2 中，再从 stack2 中 pop 元素。

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
