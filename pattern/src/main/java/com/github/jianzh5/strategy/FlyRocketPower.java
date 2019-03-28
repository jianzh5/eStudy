package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>FlyRocketPower</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:44
 */
public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket");
    }
}
