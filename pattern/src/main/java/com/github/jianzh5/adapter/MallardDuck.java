package com.github.jianzh5.adapter;

/**
 * <p>
 * <code>MallardDuck</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/3下午3:53
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
