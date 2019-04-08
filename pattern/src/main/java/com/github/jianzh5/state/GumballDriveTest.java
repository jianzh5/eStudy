package com.github.jianzh5.state;

/**
 * <p>
 * <code>GumballDriveTest</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/7下午9:39
 */
public class GumballDriveTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnQuarter();

        System.out.println(gumballMachine);
    }
}
