package com.github.jianzh5.adapter;

/**
 * <p>
 * <code>TurkeyAdapter</code>
 * </p>
 * Description:
 * 适配器对象，适配成Duck
 * @author jam
 * @date 2019/4/3下午3:55
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
