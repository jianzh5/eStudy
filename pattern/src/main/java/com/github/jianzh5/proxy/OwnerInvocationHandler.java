package com.github.jianzh5.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 * <code>OwnerInvocationHandler</code>
 * </p>
 * Description:
 * 只允许执行get set 方法  不允许执行setHotOrNotRating方法
 * @author jam
 * @date 2019/4/14下午9:41
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().equals("set")){
                return method.invoke(personBean,args);
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }

        return null;
    }
}
