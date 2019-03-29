package com.github.jianzh5.decorator;

/**
 * <p>
 * <code>HouseBlend</code>
 * </p>
 * Description:
 * 具体组件
 * @author jam
 * @date 2019/3/29下午10:41
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
