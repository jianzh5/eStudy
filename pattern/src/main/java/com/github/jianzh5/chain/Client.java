/*
 * Copyright 2018 IFlyTek. All rights reserved.
 */

package com.github.jianzh5.chain;

import java.util.Random;

/**
 * <p>
 * <code>Client</code>
 * </p>
 * Description:
 *
 * @author jianzhang11
 * @date 2019/3/28 12:22
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();

        int type = random.nextInt(4);
        System.out.println(type);
        Women women = new Women(type, "我要出去逛街");

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        father.HandlerMessage(women);
    }

}
