package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>ModelDuck</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:45
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("i am a model duck");
    }
}
