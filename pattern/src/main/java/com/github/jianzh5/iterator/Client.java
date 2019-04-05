package com.github.jianzh5.iterator;

/**
 * <p>
 * <code>Client</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/5下午7:21
 */
public class Client {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CofeMenu cofeMenu = new CofeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, cofeMenu);
        waitress.printMenu();
    }
}
