package lyx.suanfa.guanchazhemoshi;

public interface beiguanchazhe {

    public void add(guanchazhe obj);

    public void remove(guanchazhe obj);

    public void send(String message);

}

//   抽象被观察者角色：也就是一个抽象主题，它把所有对观察者对象的引用保存在一个集合中，
//  每个主题都可以有任意数量的观察者。抽象主题提供一个接口，可以增加和删除观察者角色。
//   一般用一个抽象类和接口来实现。
//
//  抽象观察者角色：为所有的具体观察者定义一个接口，在得到主题通知时更新自己。
//
//  具体被观察者角色：也就是一个具体的主题，在集体主题的内部状态改变时，
//             所有登记过的观察者发出通知。
//
//   具体观察者角色：实现抽象观察者角色所需要的更新接口，一边使本身的状态与制图的状态相协调。