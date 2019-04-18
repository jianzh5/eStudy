package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>Observer</code>
 * </p>
 * Description:
 * 观察者都必须实现统一的方法，当主题发生变化时调用该方法通知自己
 * @author jam
 * @date 2019/4/17下午7:11
 */
public interface Observer {
    public void update(QuackObservable duck);
}
