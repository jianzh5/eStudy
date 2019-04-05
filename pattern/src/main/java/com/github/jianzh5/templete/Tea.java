package com.github.jianzh5.templete;

/**
 * <p>
 * <code>Tea</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/5上午11:31
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
