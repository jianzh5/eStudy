package com.github.jianzh5.strategy;

/**
 * <p>
 * <code>Client</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/28下午10:40
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.perforFly();
        duck.swim();


        Duck model = new ModelDuck();
        model.perforFly();
        model.setFlyBehavior(new FlyRocketPower());
        model.perforFly();
        model.performQuack();

    }

}
