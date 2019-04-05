package com.github.jianzh5.templete;

/**
 * <p>
 * <code>CaffeineBeverage</code>
 * </p>
 * Description:
 * 抽象类
 * @author jam
 * @date 2019/4/5上午11:27
 */
public abstract class CaffeineBeverage {
    /**
     * 用作算法的模板
     * 定义成final，以免子模板改变算法的顺序
     */
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    /**
     * 钩子方法，由子类决定是否实现
     * 钩子可以作为条件控制，影响抽象类中的算法流程
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }

    //用abstract修饰的方法需要子类去实现'/
    abstract void brew();

    /**
     * 抽象方法一般叫做原语操作，具体子类必须实现他们
     */
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling the water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
