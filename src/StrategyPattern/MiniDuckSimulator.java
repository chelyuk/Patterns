package StrategyPattern;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoyDuck = new DecoyDuck();

        Duck model = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuckie.performQuack();
        decoyDuck.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
