package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>Quack</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:33
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
