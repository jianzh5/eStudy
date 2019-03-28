package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>Duck</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:29
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void perforFly(){
        flyBehavior.fly();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All duck float,even decoys");
    }


}
