package com.github.jianzh5.decorator;

/**
 * <p>
 * <code>Coffe</code>
 * </p>
 * Description:
 * 装饰着模式需要针对抽象组件类型编程
 * @author jam
 * @date 2019/3/29下午10:48
 */
public class Coffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        //通过装饰类Mocha来装饰Espresso
        //由于装饰类Mocha与被装饰类Espresso拥有共同子类，所以可以替换掉
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
    }

}
