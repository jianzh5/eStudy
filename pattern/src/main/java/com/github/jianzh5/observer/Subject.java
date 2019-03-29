package com.github.jianzh5.observer;


/**
 * <p>
 * <code>Subject</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/29下午3:44
 */
public interface Subject {
    /**
     * 注册成为观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
