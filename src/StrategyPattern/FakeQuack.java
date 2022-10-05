package StrategyPattern;

public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.print("Qwak");
    }
}
