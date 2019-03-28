/*
 * Copyright 2018 IFlyTek. All rights reserved.
 */

package com.github.jianzh5.chain;

/**
 * <p>
 * <code>Women</code>
 * </p>
 * Description:
 *
 * @author jianzhang11
 * @date 2019/3/28 12:09
 */
public class Women implements IWomen {
    /**
     * 1 --未出嫁
     * 2 -- 出嫁
     * 3 -- 夫死
     */
    private int type = 0;
    /**
     * 请示
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type){
            case 1:
                    this.request = "女儿的请求是："+request;
                    break;
            case 2:
                this.request = "妻子的请求是："+request;
                break;
            case 3:
                this.request = "母亲的请求是："+request;
                break;
             default:
                 throw new IllegalArgumentException("参数异常");
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
