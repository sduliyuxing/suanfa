package lyx.suanfa.lianxi;

import lyx.suanfa.LINK_NODE;

/**
 * @Title huanderukou
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\21 0021 15:15
 */
public class huanderukou {

//    ��Ŀ����
//
//    ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
//
//    ����˼·
//
//    һ�ַ������� hashmap���洢�Ͳ��ҽڵ�;
//    ��һ�ַ�����˫ָ�뷨��
//
//    ���軷����Ϊn�����뻷֮ǰ������Ϊx,slow�ڻ�������k�����,fast�ƻ�����mȦ,
//    ����2(x+k)=x+mn+k ���Եó�x = mn - k����ʱslow����ڽ�㻹ʣ n-k�����,x=(m-1)n+n-k��
//    ��һ��ָ�������ͷ�ڵ��ߵ�����ڵĳ��ȵ�����һ��ָ���������λ���� m-1Ȧ������n-k�ĳ��ȣ�
//    Ҳ����˵����ָ����������һ��ָ��ص�ͷ�ڵ㣬��һ��ָ�벻����Ȼ������ͬʱ��ǰÿ����һ����
//    ����������ʱ�������Ľڵ㼴Ϊ����ڽڵ㡣
//
//    ���ԣ�������������ָ�룬һ���ǿ�ָ��fast��һ������ָ��slow��fastһ����������slowһ����һ����
//    ����������л���ô������ָ������ʱһ���ڻ��ڡ���ʱ��һ��ָ��ָ������ͷ������һ�����䣬
//    ����ͬʱÿ����ǰ��һ��,������ָ���ٴ�����ʱ��Ϊ������ڽڵ㡣���fast�ߵ�null���޻���
    public static LINK_NODE getrukou(LINK_NODE node){
        if (node.getNext()==null){
            return null;
        }
        LINK_NODE fast=node.getNext().getNext();
        LINK_NODE slow=node.getNext();
        while (fast!=null){
            if (fast==slow){
                fast=node;
                while (fast!=slow){
                    fast=fast.getNext();
                    slow=slow.getNext();
                }
                return fast;
            }
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }
        return null;
    }
}
