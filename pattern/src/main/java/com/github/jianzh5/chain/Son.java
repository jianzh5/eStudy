package com.github.jianzh5.chain;

/**
 * <p>
 * <code>Husband</code>
 * </p>
 * Description:
 *
 * @author jianzh5
 * @date 2019/3/28 12:20
 */
public class Son extends Handler {

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------女儿向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("-----儿子同意------");
    }
}
