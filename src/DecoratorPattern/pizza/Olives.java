package DecoratorPattern.pizza;

public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + .30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
}
