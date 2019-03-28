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
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------女儿向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("-----丈夫同意------");
    }
}
