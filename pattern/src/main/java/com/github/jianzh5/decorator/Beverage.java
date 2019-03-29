package com.github.jianzh5.decorator;

/**
 * <p>
 * <code>Beverage</code>
 * </p>
 * Description:
 * 抽象饮料类
 * @author jam
 * @date 2019/3/29下午10:34
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * 抽象计算金额方法，必须子类去实现
     * @return
     */
    public abstract double cost();
}
