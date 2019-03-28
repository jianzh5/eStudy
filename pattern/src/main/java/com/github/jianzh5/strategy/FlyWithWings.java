package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>FlyWithWings</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:31
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
