package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>MallardDuck</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:34
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i am a mallard duck");
    }
}
