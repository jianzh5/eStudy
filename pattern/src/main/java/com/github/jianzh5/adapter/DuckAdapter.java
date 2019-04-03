package com.github.jianzh5.adapter;

/**
 * <p>
 * <code>DuckAdapter</code>
 * </p>
 * Description:
 * Turkey适配器，适配成Tureky
 * @author jam
 * @date 2019/4/3下午4:04
 */
public class DuckAdapter implements Turkey {
    //被适配对象
    Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
