/*
 * Copyright 2018 IFlyTek. All rights reserved.
 */

package com.github.jianzh5.chain;

/**
 * <p>
 * <code>Handler</code>
 * </p>
 * Description:
 * 抽象实现类
 * @author jianzhang11
 * @date 2019/3/28 12:14
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandlerMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.HandlerMessage(women);
            }else{
                System.out.println("--没有后续处理人--");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /**
     * 由具体子类执行
     * @author jianzhang11
     * @date 2019/3/28 14:32
     * @param women 根据业务换成request对象
     */
    protected abstract void response(IWomen women);
}
