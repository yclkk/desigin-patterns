package com.zyc.ChapterTwo.eight;

/**
 * 使用类来模拟接口
 */
public class MockInterface {

    /**
     * 将访问权限设置为protected，避免这个类被实例化
     */
    protected MockInterface() {}

    /**
     * 抛出这个异常，只要继承这个类的如果不重写这个方法就会编译不通过
     */
    public void funA() {
//        throw new MethodUnsupportedException();
    }
}
