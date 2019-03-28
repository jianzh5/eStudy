package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>FlyNoWay</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:48
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
