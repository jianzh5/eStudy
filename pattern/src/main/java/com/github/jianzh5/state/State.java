package com.github.jianzh5.state;

/**
 * <p>
 * <code>State</code>
 * </p>
 * Description:
 * 状态接口
 * @author jam
 * @date 2019/4/7下午9:49
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
