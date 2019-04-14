package com.github.jianzh5.proxy;

import java.lang.reflect.Proxy;

/**
 * <p>
 * <code>ProxyUtil</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/14下午9:53
 */
public class ProxyUtil {

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                                                    person.getClass().getInterfaces(),
                                                    new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                                        person.getClass().getInterfaces(),
                                        new NonOwnerInvocationHandler(person));
    }
}
