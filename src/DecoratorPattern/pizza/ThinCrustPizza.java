package DecoratorPattern.pizza;

public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza() {
        description = "Thin crust pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
