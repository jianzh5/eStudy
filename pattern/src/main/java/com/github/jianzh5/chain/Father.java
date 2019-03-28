/*
 * Copyright 2018 IFlyTek. All rights reserved.
 */

package com.github.jianzh5.chain;

/**
 * <p>
 * <code>Father</code>
 * </p>
 * Description:
 *
 * @author jianzh5
 * @date 2019/3/28 12:18
 */
public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("-----父亲同意------");
    }
}
