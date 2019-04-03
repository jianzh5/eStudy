package com.github.jianzh5.adapter;

/**
 * <p>
 * <code>DuckTestDrive</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/3下午3:57
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck duckAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turekey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nthe duck says...");
        testDuck(duck);

        System.out.println("\nthe duckAdapter says...");
        testDuck(duckAdapter);


        Turkey turekyAdapter = new DuckAdapter(duck);
        System.out.println("\nthe turekyAdapter says...");
        turekyAdapter.gobble();
        turekyAdapter.fly();

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
