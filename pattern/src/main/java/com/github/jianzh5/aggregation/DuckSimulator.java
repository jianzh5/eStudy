package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>DuckSimulator</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/16下午7:17
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulayor(duckFactory);
    }

    private void simulayor(AbstractDuckFactory duckFactory) {
        //抽象工厂模式

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        //适配器模式
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulayor \n---------");


        //组合模式
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallardDucks = new Flock();

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();
        flockOfMallardDucks.add(mallardDuckOne);
        flockOfMallardDucks.add(mallardDuckTwo);
        flockOfMallardDucks.add(mallardDuckThree);
        flockOfMallardDucks.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallardDucks);


        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);



        System.out.println("----test allDuck-----");
        simulayor(flockOfDucks);
        System.out.println("----just test mallardDuck-----");
        simulayor(flockOfMallardDucks);


        System.out.println("----------");
        System.out.println("The Duck quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulayor(Quackable duck) {
        duck.quack();
    }
}
