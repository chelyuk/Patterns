package StrategyPattern;

public class DuckSimulator {
    public static void main(String[] args) {
//        Test a duck
        Duck duck = new MallardDuck();
        testDuck(duck);
//        Test a turkey
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quak();
        duck.fly();
    }
}
