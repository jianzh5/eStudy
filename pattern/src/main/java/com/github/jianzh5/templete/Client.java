package com.github.jianzh5.templete;

/**
 * <p>
 * <code>Client</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/5上午11:46
 */
public class Client {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }
}
