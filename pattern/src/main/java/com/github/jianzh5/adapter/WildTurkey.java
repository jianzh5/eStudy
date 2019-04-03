package com.github.jianzh5.adapter;

/**
 * <p>
 * <code>WildTurkey</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/3下午3:54
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("i am flying a short distance");
    }
}
